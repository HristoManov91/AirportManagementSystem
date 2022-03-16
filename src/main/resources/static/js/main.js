const ROUTE_PREFIX = "http://localhost:8080/";
async function getData() {
    const response = await fetch(ROUTE_PREFIX + "/airplanes");

    const data = await response.json();
    data.forEach(airplane => airplanes.push(airplane));

}

getData();

document.getElementById('loadAirplanes').addEventListener('click', loadAllAirplanes())

const airplanes = [];

function loadAllAirplanes() {
    //Table
    let tableElement = document.querySelector('table');
    tableElement.innerHTML = '';

    let theadElement = document.createElement('thead');
    let trElement = document.createElement('tr');

    let thElementManufacture = document.createElement('th');
    thElementManufacture.textContent = 'Manufacture';
    trElement.append(thElementManufacture);

    let thElementModel = document.createElement('th');
    thElementModel.textContent = 'Model';
    trElement.append(thElementModel);

    let thElementARN = document.createElement('th');
    thElementARN.textContent = 'ARN';
    trElement.append(thElementARN);

    let thElementAirline = document.createElement('th');
    thElementAirline.textContent = 'Airline';
    trElement.append(thElementAirline);

    let thElementDateOfManuc = document.createElement('th');
    thElementDateOfManuc.textContent = 'Date of manufacture';
    trElement.append(thElementDateOfManuc);

    let thElementCockpitCrew = document.createElement('th');
    thElementCockpitCrew.textContent = 'Cockpit crew';
    trElement.append(thElementCockpitCrew);

    let thElementSeats = document.createElement('th');
    thElementSeats.textContent = 'Seats';
    trElement.append(thElementSeats);

    let thElementWeight = document.createElement('th');
    thElementWeight.textContent = 'Max take off weight';
    trElement.append(thElementWeight);

    let thElementFuelCapacity = document.createElement('th');
    thElementFuelCapacity.textContent = 'Fuel Capacity';
    trElement.append(thElementFuelCapacity);

    let thElementFuelConsumption = document.createElement('th');
    thElementFuelConsumption.textContent = 'Fuel Consumption';
    trElement.append(thElementFuelConsumption);

    let thElementSpeed = document.createElement('th');
    thElementSpeed.textContent = 'Max speed';
    trElement.append(thElementSpeed);

    let thElementRange = document.createElement('th');
    thElementRange.textContent = 'Typical range';
    trElement.append(thElementRange);

    let thElementAirport = document.createElement('th');
    thElementAirport.textContent = 'Airport';
    trElement.append(thElementAirport);

    let thElementDesc = document.createElement('th');
    thElementDesc.textContent = 'Description';
    trElement.append(thElementDesc);

    let thElementStatus = document.createElement('th');
    thElementStatus.textContent = 'Status';
    trElement.append(thElementStatus);

    theadElement.append(trElement);
    tableElement.append(theadElement);

    //Rows
    let tbodyElement = document.createElement('tbody');
    airplanes.forEach(airplane => {
        let tableRow = document.createElement('tr');
        tableRow.innerHTML = '<td>' + airplane.manufacture + '</td>' +
            '<td>' + airplane.model + '</td>' +
            '<td>' + airplane.ARN + '</td>' +
            '<td>' + airplane.airline + '</td>' +
            '<td>' + airplane.dateOfManufacture + '</td>' +
            '<td>' + airplane.cockpitCrew + '</td>' +
            '<td>' + airplane.countOfSeats + '</td>' +
            '<td>' + airplane.maxTakeoffWeight + '</td>' +
            '<td>' + airplane.fuelCapacity + '</td>' +
            '<td>' + airplane.fuelConsumption + '</td>' +
            '<td>' + airplane.maxSpeed + '</td>' +
            '<td>' + airplane.typicalRange + '</td>' +
            '<td>' + airplane.airport + '</td>' +
            '<td>' + airplane.description + '</td>' +
            '<td>' + airplane.status + '</td>'

        tbodyElement.append(tableRow);
    })
}
