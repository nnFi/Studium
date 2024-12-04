function addData() {
    let first = document.getElementById("firstEntry").value;
    let second = document.getElementById("secondEntry").value;
    let third = document.getElementById("thirdEntry").value;

    let table = document.getElementById("table"); 
    let newRow = table.insertRow(table.rows.length);
    
    newRow.insertCell(0).innerHTML = first;
    newRow.insertCell(1).innerHTML = second;
    newRow.insertCell(2).innerHTML = third;

    clearData();
}

function deleteData() {
    let table = document.getElementById("table"); 
    if ((table.rows.length - 1) > 0) {
        table.deleteRow(table.rows.length - 1);
    }
}

function clearData() {
    document.getElementById("firstEntry").value = "";
    document.getElementById("secondEntry").value = "";
    document.getElementById("thirdEntry").value = "";
}

function gotoTable() {
    window.location.href='Tabellen2.html';
}

function goBack() {
    window.location.href='Tabellen.html';
}