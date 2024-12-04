let wiederholung = prompt("Wie viele Wiederholungen",1);
let i = 1;
let b = false;

document.write("<h1>Quadrate mit for-Schleife:</h1><br>")

for (i = 1; i<= wiederholung; i++) {
    document.write("Quadrate der Zahl ", i , ": ", i**2, "<br>");
};

document.write("<h1>Quadrate mit do-Schleife:</h1><br>");

i = 1;
b = false;

do {
    if (i**2 <= 1764) {
        document.write("Quadrate der Zahl ", i , ": ", i**2, "<br>");
        i++;
    } else b = true;
}while(i <= wiederholung && b == false);

document.write("<h1>Quadrate mit while-Schleife:</h1><br>");

i = 1;
b = false;
while (i <= wiederholung && b == false) {
    if (i**2 <= 1764) {
        document.write("Quadrate der Zahl ", i , ": ", i**2, "<br>");
        i++;
    } else b = true;
}