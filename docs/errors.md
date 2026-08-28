## 2026-08-25 (1일차)

| 에러 | 원인 | 해결 |
|---|---|---|
| `javac: command not found` | PATH에 JDK 없음 | IntelliJ 터미널 사용 |
| 한글이 `???` | 콘솔 인코딩 | `javac -encoding UTF-8` |
| `클래스를 찾을 수 없습니다` | 파일명 ≠ 클래스명 | 이름을 맞춤 |
| `ArithmeticException: / by zero` | 0으로 나눔 | 조건문 추가 |

`NullPointerException`
원인 : null인 참조로 메서드를 부를 때
해결 : 사용하기 전에 null 체크를 하거나, 애초에 null이 되지 않도록 생성자에서 강제로 값을 넣기
`ArrayIndexOutOfBoundsException`
원인 : 배열이 가진 칸 수를 벗어난 인덱스로 접근할 때
해결 : 인덱스가 0부터 배열길이-1 사이인지 확인, for (int i = 0; i < arr.length; i++)처럼 length를 기준으로 반복
`ArithmeticException`
원인 : 정수를 0으로 나눌 때 
해결 : 나누기 전에 분모가 0인지 미리 체크
`ClassCastException`
원인 : 호환 안 되는 타입으로 강제 형변환할 때
해결 : 형변환 전에 instanceof로 실제 타입인지 확인하고 변환
` NumberFormatException`
원인 : 숫자로 변환할 수 없는 문자열을 parseInt 등으로 변환하려 할 때
해결 :  변환 전에 문자열이 숫자 형태인지 검증, 혹은 try-catch로 감싸서 처리