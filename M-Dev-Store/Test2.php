<html>
	<body>		
		<p> Công việc: <input type="text" id="cviec"></input> </p>
		<button onclick="themvao()">Thêm ND</button>
		<button onclick="xoaHet()">Xóa hết</button>
		
		<h2>Công việc cần làm trong ngày: </h2>
		<ol id="noidung">			
		</ol>
	</body>
	
	<script>	
		var solan = 0;
		function themvao() {
			solan++;
			var elemNoidung = document.getElementById("noidung");
			var cviec = document.getElementById("cviec");
			elemNoidung.innerHTML += 
				"<li id='phantu" + solan
					+ "' onclick=removept("+ solan +")>" 
					
					+ " <img src='huan.jpg'></img> " 
					+ cviec.value + " </li>";
		}
		function xoaHet() {
			var elemNoidung = document.getElementById("noidung");
			elemNoidung.innerHTML = "";
			solan = 0;<html>
	<body>		
		<p> Công việc: <input type="text" id="cviec"></input> </p>
		<button onclick="themvao()">Thêm ND</button>
		<button onclick="xoaHet()">Xóa hết</button>
		
		<h2>Công việc cần làm trong ngày: </h2>
		<ol id="noidung">			
		</ol>
	</body>
	
	<script>	
		var solan = 0;
		function themvao() {
			solan++;
			var elemNoidung = document.getElementById("noidung");
			var cviec = document.getElementById("cviec");
			elemNoidung.innerHTML += 
				"<li id='phantu" + solan
					+ "' onclick=removept("+ solan +")>" 
					
					+ " <img src='h01.jpg'></img> " 
					+ cviec.value + " </li>";
		}
		function xoaHet() {
			var elemNoidung = document.getElementById("noidung");
			elemNoidung.innerHTML = "";
			solan = 0;
		}		
		function removept(stt) {
			var pt = document.getElementById("phantu"+stt);
			pt.remove();
		}		
	</script>
</html>
		}		
		function removept(stt) {
			var pt = document.getElementById("phantu"+stt);
			pt.remove();
		}		
	</script>
</html>