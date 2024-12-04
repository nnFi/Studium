const r = 5;

function kreisflaeche(radius) {
    if (isNaN(radius) || radius <= 0) {
        return false;
    }
    const flaeche = Math.PI*(radius*radius);

    return flaeche.toFixed(3);
}

document.write("Radius: ", r);
document.write("<br>");
document.write("Kreisfläche: ", kreisflaeche(r));