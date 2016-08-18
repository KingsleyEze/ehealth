var app = angular.module('contactBook', []);
var db = new PouchDB('contactBook');
var remoteCouch = false;


app.controller('myCtrl', function($scope) {

    //stores contact to the db
    $scope.addContact = function(){

    //gets name values of contact name from HTML DOM
    var contactName = document.getElementById("contactName").value;

    var data = { _id: new Date().toISOString(), name: contactName, completed: false };

    db.put(data, function callback(err, result) {
      if (!err) {
        console.log('Successfully posted a contact!');
      }
    });
  }

  $scope.getContacts = function(){

        $scope.contactList = db.allDocs({include_docs: true, descending: true}, function(err, doc) {
        $scope.$apply(function(){
          $scope.contactList = doc.rows;
        })
    });
  }

  //gets the list of contacts
  $scope.contactList = $scope.getContacts();

  //monitors db changes
  db.changes({since: 'now', live: true }).on('change',  $scope.getContacts);

});
