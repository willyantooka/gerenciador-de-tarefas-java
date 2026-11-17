# Gerenciador de Tarefas

Aplicação de gerenciamento de tarefas desenvolvida em Java, utilizando programação orientada a objetos e interação pelo terminal.

## O que faz

- Adiciona novas tarefas com uma descrição e um status inicial (concluída ou pendente)
- Gera um ID automaticamente para cada tarefa cadastrada
- Remove tarefas utilizando o ID
- Marca tarefas pendentes como concluídas
- Informa quando uma tarefa já está concluída ou quando o ID não é encontrado
- Lista todas as tarefas cadastradas, exibindo ID, descrição e status
- Apresenta um menu interativo para acessar as funcionalidades

## Tecnologias

- Java
- ArrayList (Collections)
- Scanner

## O que pratiquei neste projeto

- Criar classes e objetos utilizando programação orientada a objetos
- Aplicar encapsulamento com atributos privados
- Utilizar construtores para inicializar os objetos
- Trabalhar com métodos getters para acessar atributos
- Utilizar `ArrayList` para armazenar e gerenciar uma lista de objetos
- Percorrer coleções com `for-each`
- Criar métodos que retornam valores, como `boolean`, `int` e objetos
- Buscar elementos pelo ID e remover objetos de uma lista
- Utilizar estruturas condicionais (`if`, `else if` e `else`)
- Criar menus interativos com `do-while` e `switch-case`
- Receber e converter entradas do usuário com `Scanner` e `Integer.parseInt()`
- Separar as responsabilidades entre as classes `Tarefa`, `GerenciadorTarefas` e `Principal`

## Estrutura do projeto

- `Tarefa.java`: representa uma tarefa, armazenando seu ID, descrição e status, além de disponibilizar métodos para consultar, alterar e exibir seus dados.
- `GerenciadorTarefas.java`: controla a lista de tarefas e implementa as operações de adicionar, buscar, remover, concluir e listar.
- `Principal.java`: contém o menu principal, recebe as informações do usuário e executa as operações solicitadas.

## Como rodar

1. Baixe ou clone o repositório
2. Abra o projeto em uma IDE compatível com Java, como Eclipse ou IntelliJ IDEA
3. Execute a classe `Principal.java`
4. Utilize o menu exibido no terminal para gerenciar suas tarefas

## Autor

Feito por Willyan como parte do meu aprendizado em programação Java e orientação a objetos.
