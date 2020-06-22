<html>

<style>
    #portview {
        position: absolute;
        overflow: hidden;
        width: 500px;
        height: 600px;
        border: 15px solid red;
    }

	#objectR {
		position:absolute;
		-ms-transform: skewY(30deg); /* IE 9 */
        transform: skewY(30deg);
        margin-right: 500px;
        border: 30px solid purple;
    }
    
    #objectRR {
		position:absolute;
		-ms-transform: skewY(30deg); /* IE 9 */
        transform: skewY(30deg);
        margin-right: 500px;
        border: 30px solid purple;
	}
</style>

<body>
	<div id="portview" onmouseover="doimau()">
	<h1> <a id="objectR" onmouseover="xoayChu()">Cửu âm chân kinh ?! </a> </h1>
	</div>
	<BR>
	<a id = "ThongTin"> </a>
</body>
<script>
var x = 0;
var y = 0;
var huongdichuyen = 1;
var goc = 0;
var idmau = 0;
var dsmau = ["red", "cyan", "magenta", "blue", "yellow"];

var obj = document.getElementById("objectR");
var infObj = document.getElementById("ThongTin");

var sizeStr = Number(obj.offsetWidth)

obj.style.top = '100px';

function running()
{
	
	obj.style.left = x + 'px';
	if (x >= 500 - sizeStr - 30)
	{
		huongdichuyen = -1;
	} 
	if (x <= 0)
	{
		huongdichuyen = 1;
	} 

	
	x += huongdichuyen*20;

	/**
	infObj.textContent = 
		"offsetTop: " + obj.offsetTop
		+ " .offsetLeft: " + obj.offsetLeft 
		+ " .offsetWidth: " + obj.offsetWidth
		+ " .offsetHeight: " + obj.offsetHeight;
		**/
		
		xoayChu();
}

function xoayChu(){
    obj.style.transform = "rotate(" + goc + "deg)";
	goc += 5;

}

function doimau() {
	obj.style.color = dsmau[idmau];
	idmau = (idmau + 1) % 5;
}

setInterval(running, 100);

</script>
</html>