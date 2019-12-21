# java-chicken-2019

## 기능 구현 목록

- [ ] 메인 화면
    - [ ] 선택지 출력 (주문등록, 결제하기, 프로그램 종료)
    - [ ] 원하는 기능 선택
        - [ ] [예외사항]: 숫자가 아닌 경우
        - [ ] [예외사항]: 선택지에 없는 경우

- [ ] 주문 등록
    - [ ] 테이블 목록 출력
        - [ ] 주문이 등록된 테이블은 결제 전까지 별도로 표
    - [ ] 테이블 선택
        - [ ] [예외사항]: 숫자가 아닌 경우
        - [ ] [예외사항]: 선택지에 없는 경우
    - [ ] 등록할 메뉴 선택
        - [ ] [예외사항]: 숫자가 아닌 경우
        - [ ] [예외사항]: 선택지에 없는 경우
    - [ ] 메뉴 수량 선택
        - [ ] [예외사항]: 숫자가 아닌 경우
        - [ ] [예외사항]: 최대수량(99개)를 넘는 경우
    - [ ] 메인 화면으로 이동

- [ ] 결제 하기
    - [ ] 테이블 선택
    - [ ] 테이블 주문 내역 출력
    - [ ] 결제 진행
        - [ ] 신용카드 또는 현금 선택
            - [ ] [예외사항]: 숫자가 아닌 경우
            - [ ] [예외사항]: 선택지에 없는 경우
        - [ ] 할인률 반영하여 결제 진행
            - [ ] 현금 결제 5% 할인 (할인 금액에서 한 번 더 할인 가능)
            - [ ] 치킨의 경 10개 단위 넘을 때마다 10000원씩 할인
        - [ ] 최종 결제 금액 출력
        - [ ] 메인 화면으로 이동

- [ ] 프로그램 종료
