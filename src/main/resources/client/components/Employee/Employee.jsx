import { useEffect, useState } from "react";
import { getTestData } from "../../api";
import "./Employee.scss";

export default function Employee() {
  const [testData, setTestData] = useState("Before API call");

  useEffect(() => {
    (async () => {
      const response = await getTestData();
      setTestData(JSON.stringify(response));
    })();
  }, []);

  return (
    <div className="app">
      <div className="header">React Starter Kit</div>
      {testData}
    </div>
  );
}
