# springboot-react-devkit

## Build client side react application

#### Install npm packages
```
npm install
```

#### Build react app bundle using webpack
```
npm run build:webpack
```
This will create a bundle and also copy the built bundle into the spring boot project's resources.

## Build spring boot application

#### Clean Build the spring boot application
```
./gradlew clean build
```

#### Run the app locally on port 8080
```
./gradlew bootRun
```
