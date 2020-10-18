#Author: josemario.guerra@portoseguro.com.br
# language: pt
@ApoliceTeste
Funcionalidade: Validar as funcionalidades da apolice
  A aplicacao precisa entregar funcionalidades da apolice conforme acordado com o negocio.

  Contexto: Cria todas as coberturas com os respectivos premios e associa na apolice
    Dado que as coberturas sao da "Porto Seguro"
      | cobertura                                     | premio    |
      | Danos Materiais                               | 350.45    |
      | Dados Corporais                               | 30.43     |
      | Colisao/Incendio/Roubo/Furto                  | 1600.32   |
      | Morte/Invalidez/Despesas Medico-Hospitalares  | 20.93     |       

  Cenario: Verifica o total de coberturas criadas
    Dado o calculo do total de coberturas criadas
    Entao o total de coberturas e de 4

  Cenario: Verifica o total de premio na apolice
    Dado o calculo do total de premio
    Entao o total de premio na apolice e de 2002.13