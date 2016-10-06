# PageObjectsSelenium

<h3>Entendendo o POM...</h3>

<p>O page object model é uma forma estruturada de criar testes ou um padrão de projeto, separando a implementação do teste, entendendo como implementação a parte do código que fará a interação com os web elements (id, name, classe, css, etc.) e o teste onde aconteceram as validações necessárias.</p>

<p>Para criar as classes de implementação usamos a classe Page Factory que possui a notação @FindBy que faz um link do elemento localizado a variável do tipo WebElement. Feito isso criamos um método que fará a iteração necessária para usar o web element que queremos.</p>

<p>
Ex 1: <b>Sem</b> page objects
<br/><br/>
WebElement botao1 = driver.findElement(By.id(botao1));
<br/><br/>
Ex 2: <b>Com</b> page objects
<br/><br/>
@FindBy(id=”botao1”)
<br/>
WebElement botao1;
<br/><br/>
public void clicarBotao1(){
<br/>
botao1.click();
<br/>
}
</p>

<p>
O primeiro exemplo parece com certeza mais fácil, porém para interagir com o botão 1 teríamos que copiar esse código em vários lugares, o que dificulta bastante a manutenção, ao passo que no exemplo 2 eu terei esse elemento em um único lugar, bastando apenas instanciar a classe que possui o método que interage com o botão 1.
</p>

<p>
Agora falando sobre a estrutura do projeto, o package que possui os testes está organizado para facilitar que seja encontrado de maneira rápida o tipo de interação com um determinado web element. Se fosse uma estrutura para testes e não uma estrutura didática teríamos mais testes sendo executados na classe de testes.
</p>

<p>
O projeto pode ser baixado ou utilizado diretamente com o uso do próprio <b>Github</b>, por meio da url do projeto.
</p>

<p>
Para evitar de ficarmos fazendo download dos jars que são necessários para que o projeto seja compilado, estou usando o <b>maven</b> que é uma ferramente de build e faz com que tudo o que é necessário para que o projeto funcione seja guardado no seu computador.
</p>
