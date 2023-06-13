package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Bem-vindo ao InvestimentosApp!");

        // Array bidimensional para armazenar perguntas e respostas
        String[][] perguntasRespostas = {
                {"Qual é a taxa básica de juros no Brasil?", "3,50%"},
                {"Qual é a fórmula para calcular o retorno sobre o investimento (ROI)?", "Lucro"},
                {"O que significa o termo 'CDI' no contexto de investimentos?", "Certificado"},
                {"Quantos anos é o prazo de vencimento de um título do Tesouro Direto?", "10"},
                {"O que é um dividendo?", "Lucro"},
                {"Qual é o principal índice da bolsa de valores brasileira?", "Ibovespa"},
                {"O que significa a sigla IPO?", "Oferta"},
                {"Quais são os três principais tipos de investimentos?", "Ações, renda fixa, imóveis"},
                {"Qual é a sigla para o imposto sobre ganho de capital?", "IR"},
                {"Qual é o limite de garantia do Fundo Garantidor de Créditos (FGC) para depósitos em conta corrente?", "250.000 (reais)"}
        };

        int acertos = 0;

        // Loop para exibir cada pergunta e verificar a resposta
        for (String[] perguntaResposta : perguntasRespostas) {
            String pergunta = perguntaResposta[0];
            String respostaCorreta = perguntaResposta[1];

            String respostaUsuario = JOptionPane.showInputDialog(null, pergunta);

            // Verifica se a resposta do usuário está correta, considerando maiúsculas/minúsculas e acentuação
            if (respostaUsuario != null && respostaUsuario.equalsIgnoreCase(respostaCorreta)) {
                JOptionPane.showMessageDialog(null, "Resposta correta!");
                acertos++;
            } else {
                JOptionPane.showMessageDialog(null, "Resposta incorreta!\nResposta correta: " + respostaCorreta);
            }
        }

        double percentualAcertos = (double) acertos / perguntasRespostas.length * 100;

        String mensagem;

        // Avaliação baseada no percentual de acertos
        if (percentualAcertos >= 0 && percentualAcertos < 40) {
            mensagem = "ND RUIM";
        } else if (percentualAcertos >= 40 && percentualAcertos < 60) {
            mensagem = "ED REGULAR";
        } else {
            mensagem = "D BOM";
        }

        // Exibe o número de acertos, percentual de acertos e a avaliação
        JOptionPane.showMessageDialog(null, "Você acertou " + acertos + " de " + perguntasRespostas.length + " perguntas. Percentual de acertos: " + percentualAcertos + "%. Avaliação: " + mensagem);

        //Nessa versão foi adicionado exemplos de funcionalidades adicionais após a exibição do resultado final. Nesse caso, foi incluído um exemplo em que uma mensagem personalizada é exibida para o usuário com base na avaliação obtida.
        //Foi adcionado  "equalsIgnoreCase()" para considerar qualquer resposta do usúario
        //Foi adicionado o "for" para a  avaliação do percentual de acertos e a exibição do resultado fina
    }
}