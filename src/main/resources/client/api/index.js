export const getTestData = () => {
    return fetch('http://localhost:8080/api/employees').then(res=> res.json());
}
