<h2>ATIVIDADE 3</h2>

<h3>Enunciado</h3> 
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir:

Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células;
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista;
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista;
Passo 5: Repita os passos 2 e 3;
Passo 6: Exiba todos os números que foram inseridos na fila.

Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.

O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual. Esse programa será avaliado pelo tutor responsável pela disciplina.

<h3>Código</h3>
O programa desenvolvido se encontra no arquivo "src/Main.java".

<h3>Output</h3>
Passo 1: Inserir os números [1, 2, 3, 4 e 5] na lista com 5 células

Lista: [1, 2, 3, 4, 5]

Passo 2: Remover todos os dados da lista e inserir em uma pilha

Lista: []

Pilha: [1, 2, 3, 4, 5]

Passo 3: Remover os dados da pilha e inserir em uma fila

Pilha: []

Fila: [5, 4, 3, 2, 1]

Passo 4: Inserir os números [6, 7, 8, 9 e 10] na lista

Lista: [6, 7, 8, 9, 10]

Passo 5: Repita os passos 2 e 3

Lista: []

Pilha: [6, 7, 8, 9, 10]

Pilha: []

Fila: [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

Passo 6: Exiba todos os números que foram inseridos na fila

Fila: [5, 4, 3, 2, 1, 10, 9, 8, 7, 6]

<h3>ANÁLISE</h3>

A  ordem final não foi a mesma que foi inicialmente inserida na lista. Isso acontece porque a pilha, diferentemente da lista e da fila, tem o formato LIFO (Last In, First Out). Quando inserimos os itens na pilha, o primeiro a ser inserido é o número “1” e o último é o “5”. Nesse caso, o resultado é [1, 2, 3, 4, 5].

A exibição da ordem é alterada ao retirar os itens da pilha. Como o último a ser inserido foi o “5”, ele será o primeiro a ser removido e, consequentemente, inserido na fila. O resultado obtido na fila então será: [5, 4, 3, 2, 1].

Da mesma forma ocorre ao repetir todo o processo com os números 6, 7, 8, 9 e 10. Ao serem removidos da pilha, o “10” vai entrar na fila na posição seguinte ao item “1”, e assim por diante. O resultado então fica sendo [5, 4, 3, 2, 1, 10, 9, 8, 7, 6].