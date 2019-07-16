package com.ray.design.patterns.chainOfResponsibility;

public class Manager extends Handler {
    public Manager() {
//        為了方便在這邊設定上級是誰
//        可以轉換到客戶端設定
        setSuccessor(new CEO());
    }

    @Override
    public void handleRequest(Trouble trouble) {
        if (trouble.getSize() > 1000) {
            successor.handleRequest(trouble);
        } else {

            System.out.println("Manager:" + trouble.getName() + "是小問題，不用擔心。");
        }
    }
}
