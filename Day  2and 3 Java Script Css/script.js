// function loadDoc() {
//     // const url="ajax_info.txt";
//     // const xhttp = new XMLHttpRequest();
//     // console.log(xhttp);
//     // // xhttp.onreadystatechange=function () { 
//     // //     if(this.readyState===4 ){
            
//     // //     }
//     // //  }
     
//     // xhttp.onload = function() {
//     //  document.getElementById("demo").innerHTML = this.response;
//     // }
//     //  xhttp.open("GET", url, true);
//     //  xhttp.send();
//   }
//   function promptfun() { 
//       var name=prompt("hello eneter your name!..");
//       document.getElementById('demo').innerHTML=name;
//    }
const cars=new Array("BMW","Audi","RollsRoys","Jaguar");
for(car in cars){
    document.getElementById('demo').append(<p>cars[car]</p>);
}
