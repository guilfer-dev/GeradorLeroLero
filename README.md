# GeradorLeroLeroJS

Versão alternativa do [Gerador de Lero Lero](https://github.com/Linojones/GeradorLeroLero) originalmente escrito em Java, por Felipe Lino.

# Crie frases impactantes como essas, em um unico clique:

> Caros amigos a consulta aos diversos militantes cumpre um papel essencial na formulação do retorno esperado a longo prazo.



>Proativamente falando a contínua expansão de nossa atividade dever ser uma lição aprendida dos índices pretendidos.



>Acima de tudo, é fundamental ressaltar que o desenvolvimento contínuo de distintas formas de atuação maximiza as possibilidades por conta para nos posicionarmos no cutting-edge do segmento.



>Todavia o início da atividade geral de formação de atitudes pode ser parte da soluçãoo dos métodos utilizados na avaliaãoo de resultados.

**É possível gerar mais de 2.500.000 frases originais para você chegar com tudo nas reuniões da empresa!!!**

Acesse aqui: https://guilfer-dev.github.io/GeradorLeroLeroJS/
Também é possível baixar o arquivo OneLineGenerator.html, tudo que é necessário para rodar está apenas neste único arquivo.

### Explicação do código em uma linha: 

```html
<button class="button" onclick='document.getElementById("new-phrase").innerHTML = [].map(phrase => phrase[Math.floor(Math.random() * phrase.length)]).join(" ")'>Gerar lero-lero</button>
```
 

 
```html
<button class="button" onclick= onclick="" >Gerar lero-lero</button>
 <!-- O atributo onclick recebe o código que será executado assim que o botão gerado pela tag <button> for pressionada pelo usuário. -->
```

_Essa é a parte JavaScript de verdade:_
```javascript
document.getElementById("new-phrase").innerHTML = ["... todas as frases em 4 arrays..."].map(phrase => phrase[Math.floor(Math.random() * phrase.length)]).join(" ");
```

```javascript
document.getElementById("new-phrase").innerHTM =
// O javascript se integram com o HTML e enxerga cada elemento e sub-elemento, como uma grande arvore de componente, neste caso estamos atribuindo um valor dentro dentro do elemento identificado pelo ID "new-phrase".
```

```javascript
["... todas as frases em 4 arrays..."].map( ()=> {})
// Agora usamos o metodo de arrays chamado "map" para retornar um novo array utilizando o resultado das função passada como parametro, para cada item do array original, que neste caso é um array de arrays.
```

_Agora é a parte mais "complexa":_
```javascript
(phrase => phrase[Math.floor(Math.random() * phrase.length)])
// Cada elemento do array será identificado como "phrase" em cada loop do método "map". Cada subarray então terá um item selecionado aleatóriamente, entre a primeira e última posição. Para isso usamos utilizando Math.random() combinado com o Math.floor: um gera um numero aleatório com casas decimais, que será multiplicado pelo tamanho do array e então o outro arredondada o valor para que seja interpretado como uma posição no array phrase. Ex: phrase[7].
```


```javascript
.join(" ")
// Após isso encerraremos a função com outro método de array que tomara o retorno do map e agregara todas as frases selecionadas em uma unica string. Esse método é o "join", que recebe como parametro o que gostariamos de usar como separador entre todos os itens que serão agregados. Em nosso caso, as frases foram pensadas para serem separadas por espaço, mas poderia ser virgula se fizesse sentido.
```

Fazer todo o código em uma unica função foi algo bem legal. Tem bastante gente na comunidade que realiza desafios similares, embora muito mais complexos.

É importante notar que códigos desse tipo diminuem consideravelmente sua legibilidade, escalabilidade e manutenabilidade. O segredo é encontrar o equilibrio!

**Isso só é possível graças ao poder dos navegadores e as funções nativas do JavaScritp ❤**