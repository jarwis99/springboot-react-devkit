const path = require('path');
const htmlWebpackPlugin = require('html-webpack-plugin');
const FileManagerPlugin = require('filemanager-webpack-plugin');

module.exports = {
    entry: path.resolve(__dirname, 'client', 'index.js'),
    output: {
        path: path.resolve(__dirname, 'public'),
        publicPath: '/',
        filename: 'bundle.js'
    },
    plugins: [
        new htmlWebpackPlugin({
            template: 'template/index.html'
        }),
        new FileManagerPlugin({
            events: {
              onEnd: {
                copy: [
                    { source: 'public', destination: '../../../build/resources/main/public' }
                ]
              },
            },
          }),
    ],
    module: {
        rules: [
            {
                test: /\.(jsx|js)$/,
                include: path.resolve(__dirname, 'client'),
                exclude: /node_modules/,
                use: [{
                    loader: 'babel-loader',
                    options: {
                        presets: [
                            ['@babel/preset-env', {
                                "targets": "defaults"
                            }],
                            ["@babel/preset-react", {
                                "runtime": "automatic"
                            }]
                        ]
                    }
                }]
            },
            {
                test: /\.css$/i,
                include: path.resolve(__dirname, 'client'),
                exclude: /node_modules/,
                use: ['style-loader', 'css-loader']
            },
            {
                test: /\.scss$/,
                include: [
                    path.resolve(__dirname, 'client')
                ],
                use: ['style-loader', 'css-loader', 'sass-loader']
            }]
    }
};