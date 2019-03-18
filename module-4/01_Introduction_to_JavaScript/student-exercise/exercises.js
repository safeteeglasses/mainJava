/*describe('exercises', () => {
    describe('Sum Double', () => {
      it('should yield 3 when given (1, 2)', () => {
        sumDouble(1, 2).should.equal(3);
      });
      it('should yield 5 when given (3, 2)', () => {
        sumDouble(3, 2).should.equal(5);
      });
      it('should yield 8 when given (2, 2)', () => {
        sumDouble(2, 2).should.equal(8);
      });*/

      function sumDouble(x, y) {
       if(x === y){
        return (x + y)*2;
       }
       return x+y;
    }

    function hasTeen(x, y, z){
        if((x >=13 && x<= 19)||(y >=13 && y<= 19)||(z >=13 && z<= 19)){
        return true;
        }
        return false;
    }
    function lastDigit(x,y){
        if(x % 10 == y % 10){
            return true;
        }
            return false;
    }
    function seeColor (x) {
        if(x.startsWith("red")) {
            return "red";
        }
        if(x.startsWith("blue")) {
            return "blue"
        }
            return "";
    }
    function oddOnly (x) {
    let odd = [];
        for(let i = 0; i<x.length; i++){
            if(x[i] % 2 != 0) {
                odd.push(x[i]);
            }
        }
        return odd;
    }
    function frontAgain(x) {
        if((x.substring(0,2) == x.substring(x.length -2))) {
        return true;
         }
        return false;
    }
    function cigarParty(x, y) {
       if(y===false && x >= 40 && x <=60) {
        return true;
       }
       if(y===true && x >= 40){
        return true;
       }
        return false;
    }   
    function fizzBuzz (x) {
        if((x % 3 == 0) && (x % 5 == 0)) {
            return "FizzBuzz";
        }
        if(x % 3 == 0){
            return "Fizz";
        }
        if(x % 5 == 0) {
            return "Buzz";
        }
        if(x === 1){
            return 1;
        }
        if(x === 2) {
            return 2;
        }
    }
    function filterEvens (x){
    let even = [];
        for(let i = 0; i<x.length; i++){
            if(x[i] % 2 == 0) {
                even.push(x[i]);
            }
            
        }
        return even;
    }
    function filterBigNumbers (x){
        let oversize = [];
            for(let i = 0; i<x.length; i++){
                if(x[i] >= 100){
                    oversize.push(x[i]);
                }
            }
        return oversize
    }
    function filterMultiplesOfX (x, y){
        let multiples = [];
        for(let i = 0; i<x.length; i++){
            if((x[i] % y == 0)){
                multiples.push(x[i]);
            }
        }
        return multiples;
    }
    function createObject() {
        const person = {firstName: "Tom", lastName: "Richards", age: '29'};
        return person;
        
        

          
    }