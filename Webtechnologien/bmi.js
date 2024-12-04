let cm = prompt("Größe: ",0);
let kg = prompt("Gewicht: ",0);

document.write("BMI: ", bmi(cm, kg).toFixed(2));

function bmi (cm, kg) {
    if (cm <= 0 || kg <= 0 || cm > 300 || kg > 300 || isNaN(cm) || isNaN(kg)) return -1;
    return kg / ((cm/100) * (cm/100));
}