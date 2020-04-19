/* 
* loads the query from the textbox to the result box
*/
function loadDoc() {
    var query = "";
    var xxhttp = new XMLHttpRequest();
    xxhttp.open("POST", "http://localhost:8080/query", true);
    xxhttp.setRequestHeader('Content-type', 'text/plain');
    query = editor.getDoc().getValue("\n");
    document.getElementById("result-box").innerHTML = "Result is loading...";
    xxhttp.send(query);
    xxhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("result-box").innerHTML = JSON.stringify(JSON.parse(this.responseText), undefined, 2);
        }
    };
}