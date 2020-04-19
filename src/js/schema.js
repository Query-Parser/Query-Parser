/*
* Adds schema based on button selected. It will only load the schema once
* Buttons will be marked blue when the schema is currently showing
*/
function setActive(e) {
    var target = e.target;
    var dbName = target.innerText;
    if (target.classList.contains("btn-back")) {
        target.classList.remove("btn-back");
    } else {
        target.classList.add("btn-back");
        if (document.getElementById(dbName).innerHTML == "") {
            var xmlhttp, myObj, key, col, inx, txt = "";
            xmlhttp = new XMLHttpRequest();
            xmlhttp.open("POST", "http://localhost:8080/schema", true);
            xmlhttp.setRequestHeader('Content-type', 'text/plain');
            xmlhttp.send(dbName);
            document.getElementById(dbName).innerHTML = dbName + " is loading...";
            xmlhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    myObj = JSON.parse(this.responseText);
                    txt += "<h2>" + dbName + "</h2>";
                    for (key in myObj) {
                        txt += "<h3>" + key + "</h3><div class='table-responsive'><table class='table table-bordered'><tr>";
                        for (col in myObj[key]) {
                            txt += "<th>" + myObj[key][col] + "</th>";
                        }
                        txt += "</tr></table></div>";
                    }
                    document.getElementById(dbName).innerHTML = txt;
                };
            }
        }
    }
}