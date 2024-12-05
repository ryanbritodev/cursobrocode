import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Ex093 {
    public static void main(String[] args) {

        // Timer
        // Uma funcionalidade para threads agendarem tarefas para execução futura em uma thread de plano de fundo
        // Resumidamente, fica de olho no tempo no background

        // TimerTask
        // Uma tarefa que pode ser agendada para execução única ou repetida por um Timer

        // Classe que contém um método abstrato chamado "run"
        // Quando o timer chega num tempo específico, ele executa uma tarefa (de forma repetida ou única)

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int contador = 10;
            @Override
            public void run() {
                // System.out.println("Tarefa completa! :)");
                if(contador > 0) {
                    System.out.println(contador + " segundos");
                    contador--;
                } else {
                    System.out.println("Feliz ano novo!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 4);
        date.set(Calendar.HOUR_OF_DAY, 11);
        date.set(Calendar.MINUTE, 47);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}
