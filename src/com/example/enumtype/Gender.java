package com.example.enumtype;

//Enum 타입의 특징
//enum은 생성자와 값을 지정할 수 있다.
//enem은 생성자를 가질 수 있지만 생성자는 private해야 한다.(외부에서 접근할 수 없다.)
//enum의 생성자는 내부에서만 호출가능하다.
public enum Gender {
        MALE("XY"),
        FEMALE("XX");//상수 뒤에 ("XY"), ("XX") 이런 것을 붙일 수 있다.

        private String chromosome;//염색체

        private Gender(String chromosome) {
            this.chromosome = chromosome;
        }


    @Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }

    public void print(){
        System.out.println("염색체 정보: " + chromosome );
    }
}