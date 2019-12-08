var dialog = document.querySelector('dialog');
document.querySelector('#openDialog').onclick = function() {
    dialog.show();
}
document.querySelector('#closeDialog').onclick = function() {
    dialog.close();
}
