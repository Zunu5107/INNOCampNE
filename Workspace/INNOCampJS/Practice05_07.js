// 메서드와 this 문제 3 <체이닝>

/* 올라가기(up)와 내려가기(down) 메서드를 제공하는 객체 ladder가 있습니다.

    let ladder = {
      step: 0,
      up() {
        this.step++;
      },
      down() {
        this.step--;
      },
      showStep: function() { // 사다리에서 몇 번째 단에 올라와 있는지 보여줌
        alert( this.step );
      }
    };
    메서드를 연이어 호출하고자 한다면 아래와 같이 코드를 작성할 수 있습니다.

    ladder.up();
    ladder.up();
    ladder.down();
    ladder.showStep(); // 1

    up, down, showStep을 수정해 아래처럼 메서드 호출 체이닝이 가능하도록 해봅시다.

    ladder.up().up().down().showStep(); // 1

    참고로 이런 방식은 자바스크립트 라이브러리에서 널리 사용됩니다.
*/

let ladder = {
    step: 0,
    up() {
        this.step++;
        return this;
    },
    down() {
        this.step--;
        return this;
    },
    showStep: function() { // 사다리에서 몇 번째 단에 올라와 있는지 보여줌
        console.log( this.step );
        return this;
    }
};

ladder.up().up().down().showStep();