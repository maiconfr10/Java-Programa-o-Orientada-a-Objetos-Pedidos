📌 README – Sistema de Pedido (Java | Programação Orientada a Objetos)
📘 Sobre o Projeto

Este projeto é um sistema simples de cadastro de pedidos, desenvolvido em Java para treinar conceitos importantes de Programação Orientada a Objetos (POO), como:

Classes e Objetos

Encapsulamento

Enumerações (Enums)

Composição entre classes

Manipulação de datas

Coleções (List)

Sobrescrita do método toString()

Regras de negócio aplicadas em objetos

O sistema permite registrar clientes, produtos, itens de pedido e um pedido completo com status e data.

🛠️ Tecnologias e Recursos Usados no Projeto
🔹 Java (versão 8+)

Toda a aplicação foi escrita em Java, utilizando recursos essenciais do núcleo da linguagem.

🔹 POO – Programação Orientada a Objetos

O projeto demonstra de forma clara:

Composição (Order → possui vários OrderItem)

Associações (Order → Client)

Reuso de código

Modelagem de domínio

🔹 Enum – OrderStatus

Usado para representar estados fixos do pedido, como:

PENDING_PAYMENT

PROCESSING

SHIPPED

DELIVERED

Enums deixam o código mais seguro e organizado.

🔹 Date e SimpleDateFormat

Utilizados para:

Ler datas digitadas pelo usuário

Formatar datas para exibir no relatório final do pedido

🔹 Scanner

Responsável pela leitura dos dados que o usuário digita no console.

🔹 List (ArrayList)

Usado para armazenar dinamicamente os itens do pedido.

🧩 Estrutura do Projeto
src/
 ├── Enum/
 │    └── OrderStatus.java
 ├── entities/
 │    ├── Client.java
 │    ├── Product.java
 │    ├── OrderItem.java
 │    └── Order.java
 └── application/
      └── Programa.java


Cada classe possui sua responsabilidade bem definida, seguindo boas práticas de separação de responsabilidades.

🚀 Funcionalidades do Sistema

✔️ Cadastrar dados de um cliente
✔️ Registrar um pedido com data e status
✔️ Cadastrar vários itens no pedido
✔️ Calcular valores individuais e total do pedido
✔️ Gerar um resumo final detalhado com:

Cliente

Data do pedido

Status

Itens

Subtotais

Total final

📄 Exemplo de Funcionamento

O sistema solicita informações via terminal:

Nome do cliente

Email

Data de nascimento

Status do pedido

Momento do pedido

Quantidade de itens

Nome do produto

Preço

Quantidade

Ao final, imprime o pedido completo formatado.

🎯 Objetivo do Projeto

Este projeto tem finalidade educacional, indicado para quem está aprendendo:

Lógica de programação

Estruturação de classes em Java

Controle de domínio de sistemas

Modelagem orientada a objetos

Boas práticas de programação

📌 Como Executar

Baixe ou clone o repositório

Abra em sua IDE preferida (Eclipse, IntelliJ, VS Code com extensão Java)

Compile e execute a classe:

application/Programa.java


Forneça as informações solicitadas no terminal.
