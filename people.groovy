class Person {
              String first
              String last
              
              String getFullName() {
                this.first + ' ' + this.last
              }
            }
            
            Person me = new Person(first: 'Jenn', last: 'Strater')
            println me.fullName
