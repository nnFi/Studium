let marken = ["Opel","Volvo","VW"];
const newMarke = "Ford";

const monate = [
    "Januar", "Februar", "März", "April", 
    "Mai", "Juni", "Juli", "August", 
    "September", "Oktober", "November", "Dezember"
];

const tage = [
    "Sonntag", "Montag", "Dienstag", "Mittwoch", 
    "Donnerstag", "Freitag", "Samstag"
];

const heute = new Date();

document.write(marken[1]);
document.write("<br>");
document.write("<br>");
document.write("Einträge unsortiert:");
for (let index = 0; index < marken.length; index++) {
    document.write("<br>");
    document.write("Eintrag ", index+1, ": ", marken[index]);
}

document.write("<br>");
document.write("<br>");
marken.push(newMarke);
marken.sort();
document.write("Einträge sortiert:");
for (let index = 0; index < marken.length; index++) {
    document.write("<br>");
    document.write("Eintrag ", index+1, ": ", marken[index]);
}

document.write("<br>");
document.write("<br>");

document.write("Heute ist ", tage[heute.getDay()], ", der ", heute.getDate(), ". ", monate[heute.getMonth()], " ", heute.getFullYear());