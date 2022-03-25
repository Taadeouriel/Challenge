// Call the dataTables jQuery plugin
$(document).ready(function() {
    chargeCharacters();
  $('#characters').DataTable();
});

async function chargeCharacters(){

  const request = await fetch('characters', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const characters = await request.json();

let htmlList = '';

for(let character of characters){

let characterhtml='<tr><td>'+character.id+'</td><td>'+character.img+'</td><td>'+character.name+'</td><td>'+character.age+'</td><td>'+character.weight+'</td><td>'+character.life+'</td> <td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>'

 htmlList += characterhtml;

}


  console.log(characters);



  document.querySelector('#characters tbody').outerHTML= htmlList;

}