let email = prompt("Geben Sie Ihre Mail an: ");

alert(mailTester(email));

function mailTester (mail) {
    if (mail.lastIndexOf("@") != mail.indexOf("@")) return false;

    if (mail.indexOf(" ") >= 0) return false;
    
    if (mail.lastIndexOf(".") - mail.lastIndexOf("@") <= 2) return false;
    return true;
}