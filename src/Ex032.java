import Ex032.Pizza;

public class Ex032 {
    public static void main(String[] args) {
        // Constructors Overload
        // São múltiplos constructors dentro de uma classe de mesmo nome, porém com parâmetros diferentes
        // nome + parâmetros = assinatura única

        // Criando o objeto da Pizza
        Pizza pizza = new Pizza("Pan", "Tomate", "Pepperoni");
        // Caso nós não quisermos nenhum topping na hora de estanciar o nosso objeto de pizza,
        // podemos criar Constructors Overloads para pegar outros tipos de entrada com menos parâmetros
        System.out.println("Esses são os ingredientes da sua pizza: ");
        System.out.println("Massa: " + pizza.massa);
        System.out.println("Molho: " + pizza.molho);
        System.out.println("Queijo: " + pizza.queijo);
        System.out.print("Topping: "+ pizza.topping);
    }
}
