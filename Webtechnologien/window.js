let myWindow;
const width = 300;
const height = 240;
const pleft = (screen.availWidth - width) / 2;
const ptop = (screen.availHeight - height) / 2;
const windowFeatures = "left=" + pleft + ",top=" + ptop + ",width=" + width + ",height=" + height;

function openWin(url) {
    window.open(url,"",windowFeatures);
    window.focus();
}

function closeWin() {
    window.close();
}