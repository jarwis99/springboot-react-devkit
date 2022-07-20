module.exports = {
    moduleNameMapper: {
      '^.*[.](style|scss|css)$': '<rootDir>/test/utils/fileMock.js'
    },
    setupFilesAfterEnv: ["<rootDir>/test/utils/setupTests.js"],
    testEnvironment: 'jsdom',
    moduleFileExtensions: ['js', 'json', 'jsx', 'ts', 'tsx', 'node']
};
