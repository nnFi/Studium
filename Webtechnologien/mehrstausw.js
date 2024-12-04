let mitarbeiterzugehoerigkeit;
let teamgroeße;
do {
    mitarbeiterzugehoerigkeit = prompt("Wie lange ist der Mitarbeiter im Unternehmen (Jahre)",0);
} while (mitarbeiterzugehoerigkeit < 0 && mitarbeiterzugehoerigkeit > 60);

if (mitarbeiterzugehoerigkeit < 1) {
    alert("Junior Consultant");
} else if (mitarbeiterzugehoerigkeit >= 1 && mitarbeiterzugehoerigkeit < 3) {
    alert("Consultant");
} else {
    teamgroeße = prompt("Wie viele Mitglieder hat das Team?",0);

    do {
        teamgroeße = prompt("Wie viele Mitglieder hat das Team?",0);
    } while (teamgroeße < 0 && teamgroeße > 750);
    
    if (teamgroeße < 1) {
        alert("Senior Consultant");
        console.log("Senior Consultant");
    } else if (teamgroeße <= 20) {
        alert("Manager");
        console.log("Manager");
    } else {
        alert("Director");
        console.log("Director");
    }
}