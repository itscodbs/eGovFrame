// Selecting Elements by ID
// Note IDs must be unique per page.
$("#myId"); // <div id ="myId">

// Selecting Elements by Class Name
$(".myClass"); // <div class="myClass">

// Selecting Elements by Attribute
// <input name = "first_name">
$("input[name='first_name']");

// Selecting Elements by Attribute
// <div id ="contents">
//	  <ul class="people">
// 		<li></li><li></li>
//    </ul>
// </div>
$("#contents ul.people li");

//[Pseude-Selectors]
// <a class="external">
// <a class="external">
$("a.external:first");
$("tr:odd");
$("div:visible");

// Select all input like elements in a from (more on this below).
// <form id="myForm">
//		<input~> <textarea>
// </form>
$("#myForm : input");

// All except the first three divs. > 2
$("div:gt(2)");

// All currently animated divs. 현재 작동 중인 것.
$("div:animated"); 

// [Choosing Selectors] length의 값이 0보다 큰지 확인.
// Find all <a> elements whose rel attribute ends with "thinger".
// <a rel="do-nothinger">
$("a[rel$='thinger']");

// Doesn't work!
/*if($("div.foo")) {
 ...
 }*/
// Testing whether a selection contains elements
if($("div.foo").length){
	
}
 
// Saving Selections
var divs = $("div");

// Refining & Filtering Selections
// div.foo elements that contain <p> tags
// <div class = "foo"> <p></p> </div>
// <div class = "foo"></div>
// <ul>
// <li> </li>
// <li class = "current"></li>
// <li> </li>
// <li> </li>
// <li> </li>
// <li> </li>
// </ul>
$("div.foo").has("p");
$("h1").not("bar"); // h1 elements that don't have a class of bar
$("ul li").filter("current"); // unordered list items with class of current
$("ul li").eq(5); // the sixth
 
// [Selecting Form Elements] 
// Using the :button pseudo-selector targets any <button> elements and elements with a typy=button 
$("form :button");

// Using the :checkbox pseudo-selector targets any <input> elements with a type="checkbox"
$("form :checkbox");

// :checked targets checked
