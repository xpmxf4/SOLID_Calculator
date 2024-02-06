# 계산기 애플리케이션

이 프로젝트는 다양한 수학 연산을 수행할 수 있는 계산기 애플리케이션을 개발하기 위한 것입니다.

초기 스프린트에서는 기본적인 산술 연산을 구현하고, 추후에는 삼각함수, 미적분, 기타 연산 기능을 추가할 예정입니다.

## 프로젝트 구조

프로젝트의 폴더 구조는 다음과 같습니다.

```bash
.
├── main
│   ├── java
│   │   └── org
│   │       └── example
│   │           ├── Calculator.java # 계산기 클래스입니다.
│   │           ├── Main.java       # 애플리케이션의 시작입니다.
│   │           ├── operation       # 연산 클래스가 위치합니다.
│   │           └── util            # 입력 파싱, 팩토리 클래스가 위치합니다.
│   └── resources
└── test
    ├── java
    │   ├── CalculatorTest.java
    │   └── util
    │       └── InputParserTest.java
    └── resources

```


## 작업 프로세스

개발 과정은 TDD(Test-Driven Development) 방식으로 진행되었습니다. 

각 기능에 대한 테스트 코드를 먼저 작성하고, 이를 통과하기 위한 실제 코드를 구현하는 순서로 작업이 진행되었습니다.

## 기능 요구사항 분석

### 기본 연산 (이번 스프린트)

1. 덧셈 (Addition)
2. 뺄셈 (Subtraction)
3. 곱셈 (Multiplication)
4. 나눗셈 (Division)

### 삼각함수 (추후 개발)

1. 사인 (Sine)
2. 코사인 (Cosine)
3. 탄젠트 (Tangent)

### 미적분 (추후 개발)

1. 적분 (Integration)
2. 미분 (Differentiation)

### 기타 연산 (추후 개발)

1. 로그 함수 (Logarithm)
