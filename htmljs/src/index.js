function addTask(){
let taskInput=document.getElementById("taskInput");
let textText = taskInput.trim(); // remove the extra spaces

if(textInput){
    let taskList = document.getElementById("taskList");
    let listItem=document.createElement('li'); //list all my task added
    //let delItem = taskText+'<span onClick="removeTask(this)"> x </span>'; // or it can be used instead of this
    listItem.innerHTML = taskText+'<span onClick="removeTask(this)"> x </span>';
    taskInput = append.childElement(listItem);
    taskInput.value="";
}

}
function removeTask(element)
{
    element.parentElement.remove();
}

document.getElementById("taskInput").addEventListener('keyPress',function(event)
{
if(event.key == 'Enter'){

}
});
