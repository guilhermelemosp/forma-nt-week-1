# Boas-vindas ao repositório de exercícios do FormaNT - Semana 01!



  <summary><strong>👨‍💻 O que deverá ser desenvolvido</strong></summary><br />

  - Nesse projeto está desenvolvido seis exercícios introdutórios para a linguagem Java.

<details>
  <summary><strong>:memo: Habilidades</strong></summary><br />

  Neste projeto, as habilidades desenvolvidas foram:

  * Implementação de classes e organização de elementos dentro do Java

  * Estruturação elementos de repetição (for, while)

  * Estruturação elementos condicionantes (if, else)

  * Estruturação de arrays e objetos, seus tipos primitivos, além de elementos de comparação.
</details>

# Orientações

<details>
  <summary><strong>‼️ Antes de começar a desenvolver</strong></summary><br />

  1. Clone o repositório

  - Use o comando: `git clone git@github.com:guilhermelemosp/forma-nt-week-1.git`.
  - Entre na pasta do repositório que você acabou de clonar:
    - `cd forma-nt-week-1`

  
  2. Crie uma branch a partir da branch `master`

  - Verifique que você está na branch `master`
    - Exemplo: `git branch`
  - Se não estiver, mude para a branch `master`
    - Exemplo: `git checkout master`
  - Agora crie uma branch à qual você vai submeter os `commits` do seu projeto

  4. Adicione as mudanças ao _stage_ do Git e faça um `commit`

  - Verifique que as mudanças ainda não estão no _stage_ com o `git status`
  - Adicione o novo arquivo ao _stage_ do Git
    - Exemplo:
      - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
      - `git status`
  - Faça o `commit` inicial
    - Exemplo:
      - `git commit -m 'iniciando o projeto x'` (fazendo o primeiro commit)

  5. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior: `git push -u origin <nome-da-branch>`

  6. Crie um novo `Pull Request` _(PR)_

  - Vá até a página de _Pull Requests_ do [repositório no GitHub]
  - Clique na caixa de seleção _"Compare"_ e escolha a sua branch
  - Coloque um título para a sua _Pull Request_
    - Exemplo: _"Cria tela de busca"_
  - Clique no botão verde _"Create pull request"_
  - Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
</details>


# Requisitos

## 1. Imprima todos números pares de 0 a 100.

---

## 2. Imprima todos os números primos de 0 a 1000.

---

## 3. Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.

---

## 4.  Monte a estrutura de classes e instancie 2 Motoristas.
  
   - <details><summary>Requisitos:</summary>

    - Uma pessoa possui { nome cpf, rg, idade };

    - Um funcionário, além de possuir as mesmas informações de uma pessoa, possui também { cargo, salário };
  </detail>
    - Ao carregar a página, o filtro selecionado deverá ser `All`.
  
   Instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista

---

## 5. Crie um método que receba um número inteiro e gere uma matriz identidade a partir deste número   . 
    Exemplo: 
        Número: 3
        Matriz:
         1    0    0
         0    1    0
         0    0    1
  
---

## 6.  Crie um método que receba o custo e o pagamento.
    <details>
  Ele deve imprimir no console as seguintes informações:
    - Valor do troco
    - Troco em menor quantidade de notas e moedas possiveis
    
    Exemplo:
        custo:
            R$ 17,35
        pagamento:
            R$ 20,00
        troco:
            R$ 2,65
        menor troco:
            1 - nota de 2
            1 - moeda de 50
            1 - moeda de 10
            1 - moeda de 5
  </details>

---
