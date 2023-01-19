// side bar button
function myAccFunc() {
    var b = document.getElementById("demoAcc");
    if (b.className.indexOf("w3-show") == -1) {
        b.className += " w3-show";
        b.previousElementSibling.className += " w3-indigo";
    } else { 
        b.className = b.className.replace(" w3-show", "");
        b.previousElementSibling.className = 
        b.previousElementSibling.className.replace(" w3-indigo", "");
    }
}

function myAccFunc2() {
    var b = document.getElementById("demoAcc2");
    if (b.className.indexOf("w3-show") == -1) {
        b.className += " w3-show";
        b.previousElementSibling.className += " w3-indigo";
    } else { 
        b.className = b.className.replace(" w3-show", "");
        b.previousElementSibling.className = 
        b.previousElementSibling.className.replace(" w3-indigo", "");
    }
}

function myAccFunc3() {
    var b = document.getElementById("demoAcc3");
    if (b.className.indexOf("w3-show") == -1) {
        b.className += " w3-show";
        b.previousElementSibling.className += " w3-indigo";
    } else { 
        b.className = b.className.replace(" w3-show", "");
        b.previousElementSibling.className = 
        b.previousElementSibling.className.replace(" w3-indigo", "");
    }
}

function myAccFunc4() {
    var b = document.getElementById("demoAcc4");
    if (b.className.indexOf("w3-show") == -1) {
        b.className += " w3-show";
        b.previousElementSibling.className += " w3-indigo";
    } else { 
        b.className = b.className.replace(" w3-show", "");
        b.previousElementSibling.className = 
        b.previousElementSibling.className.replace(" w3-indigo", "");
    }
}
    
function w3_open() {
   document.getElementById("mySidebar").style.display = "block";
}

function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}    

// tabs
function openTab(tabName) {
    var i;
    var x = document.getElementsByClassName("tab");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    document.getElementById(tabName).style.display = "block";  
}


