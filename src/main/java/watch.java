public class watch {

    int m=0,h=0,D=1,M=1,Y=2000;
    enum State{Normal,Alarm,Update}
    enum State1{Time,Date,Alarm,Chime,Min,Hour,Day,Month,Year}

    public void incr60(){
        if(m==60) {
            m=0;
            incr24();
        }
        else
            m++;
    }
    public void incr24(){
        if(h==24) {
            h=0;
            incr31();
        }

        else
            h++;
    }
    public void incr31(){
        if(D==31) {
            D = 0;
            incr12();
        }
        else
            D++;
    }
    public void incr12(){
        if(M==12) {
            M = 0;
            Y++;
        }
        else
            M++;
    }

    public String ModifyState(String input){
        State state=State.Normal;
        State1 state1=State1.Time;
        char[] inputString=input.toCharArray();

        for(char in :inputString){
            switch (state){
                case Normal :
                    if(in=='c'){
                        state=State.Update;
                        state1=State1.Min;
                    }
                    else if(in=='b'){
                        state=State.Alarm;
                        state1=State1.Alarm;
                    }
                    else if(in=='a'){
                        if (state1==State1.Time)
                            state1=State1.Date;
                        else
                            state1=State1.Time;
                    }
                    break;
                case Update:
                    if (in == 'a'){
                        if(state1 == State1.Min){
                            state1 = State1.Hour;
                        }
                        else if(state1 == State1.Hour){
                            state1 = State1.Day;
                        }
                        else if(state1 == State1.Day){
                            state1 = State1.Month;
                        }
                        else if(state1 == State1.Month){
                            state1 = State1.Year;
                        }
                        else{
                            state = State.Normal;
                            state1 = State1.Time;
                        }
                    }
                    else if(in == 'b'){
                        if(state1 == State1.Min){
                            incr60();
                        }
                        else if(state1 == State1.Hour){
                            incr24();
                        }
                        else if(state1 == State1.Day){
                            incr31();
                        }
                        else if(state1 == State1.Month){
                            incr12();
                        }
                        else if(state1 == State1.Year){
                            Y++;
                        }
                    }
                    else if(in == 'd'){
                        state = State.Normal;
                        state1 = State1.Time;
                    }
                    break;
                case Alarm:
                    if(in == 'a' && state1 == State1.Alarm){
                        state1 = State1.Chime;
                    }
                    else if(in == 'd'){
                        state = State.Normal;
                        state1 = State1.Time;
                    }
                }
            }
        String output= state+" "+state1+" "+D +"/"+M+" "+Y+" "+h+":"+m;
        return output;
    }
    public static void main(String[] args){
        watch clock=new watch();
        System.out.println( clock.ModifyState("cbbbabbababbbbb"));
    }
}


