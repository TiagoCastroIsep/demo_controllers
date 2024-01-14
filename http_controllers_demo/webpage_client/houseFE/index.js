const container = document.getElementById("container");
const url = "http://localhost:8080";


const getDataFromAPI = async () => {
  const data = await fetch(`${url}/house`, {
    method: "GET"
  })

  const house = await data.json();

  console.log(house);

  house.forEach(h => {
    const obj = {
      name: h.name,
      doorNumber: h.doorNumber
    };

    const h1 = document.createElement("h1");
    h1.innerHTML = `name: ${obj.name} number: ${obj.doorNumber}`;

    container.appendChild(h1);
  })
}

getDataFromAPI();