// 함수 문제 1 <"else"는 정말 필요한가요?>

/*아래 함수는 매개변수 age가 18보다 큰 경우 true를 반환합니다.

    그 이외의 경우는 컨펌 대화상자를 통해 사용자에게 질문한 후, 해당 결과를 반환합니다.

        function checkAge(age) {
          if (age > 18) {
            return true;
          } else {
            // ...
            return confirm('보호자의 동의를 받으셨나요?');
          }
        }
    위 코드에서 else문을 삭제해도 기존 코드와 동일하게 작동할까요?

        function checkAge(age) {
          if (age > 18) {
            return true;
          }
          // ...
          return confirm('보호자의 동의를 받으셨나요?');
        }

    아니면 뭔가 변화가 있을까요?
*/

// 삭제해도 된다.
// 이유 : return은 함수를 바로 나가게 하는 명령어기 때문에

