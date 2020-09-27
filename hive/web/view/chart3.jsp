<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
#container{
	width:600px;
	height:500px;
	border:2px solid red;
}
</style>
<script>
function display(data){
	var chart = Highcharts.chart('container', {

	    chart: {
	        type: 'column'
	    },

	    title: {
	        text: 'Highcharts responsive chart'
	    },

	    subtitle: {
	        text: 'Resize the frame or click buttons to change appearance'
	    },

	    legend: {
	        align: 'right',
	        verticalAlign: 'middle',
	        layout: 'vertical'
	    },

	    xAxis: {
	    	categories: ['Africa', 'America', 'Asia', 'Europe', 'Oceania']
	    }
	  ,

	    yAxis: {
	        allowDecimals: false,
	        title: {
	            text: 'Amount'
	        }
	    },

	    series: data,
	    responsive: {
	        rules: [{
	            condition: {
	                maxWidth: 500
	            },
	            chartOptions: {
	                legend: {
	                    align: 'center',
	                    verticalAlign: 'bottom',
	                    layout: 'horizontal'
	                },
	                yAxis: {
	                    labels: {
	                        align: 'left',
	                        x: 0,
	                        y: -5
	                    },
	                    title: {
	                        text: null
	                    }
	                },
	                subtitle: {
	                    text: null
	                },
	                credits: {
	                    enabled: false
	                }
	            }
	        }]
	    }
	});

	document.getElementById('small').addEventListener('click', function () {
	    chart.setSize(400);
	});

	document.getElementById('large').addEventListener('click', function () {
	    chart.setSize(600);
	});

	document.getElementById('auto').addEventListener('click', function () {
	    chart.setSize(null);
	});
}

function getData(){
	$.ajax({
		url:'getdata3.mc',
		success:function(data){
			display(data);
		},
		error:function(){}
	});
};

$(document).ready(function(){
		getData();
});
</script>
Chart1
<div id="container">

</div>