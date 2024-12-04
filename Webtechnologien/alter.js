let jetzt = new Date();
let GebTag = new Date(prompt("Geburtstag", "06.09.2023")); //Macht das Datum nicht richtig -> vertauscht Tag und Monat jetzt.toLocaleDateString()
let alter = getAlter(GebTag, jetzt);
alert(alter);

function getAlter(gtag, heute) {
    let jahre = heute.getFullYear() - gtag.getFullYear();
    if (jahre < 0) return "noch nicht geboren";
    if (gtag.getMonth() === heute.getMonth()) {
        if (gtag.getDate() - heute.getDate() > 0) {
            jahre -= 1;
        }
    }
    if (gtag.getMonth() > heute.getMonth()) jahre -= 1;
    return jahre;
}