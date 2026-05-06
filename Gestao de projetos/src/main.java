import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {





    int inicioprograma = 0;

    // usuario logado
    String[] usuarioLogado = new String[7];

    Scanner scanner = new Scanner(System.in);

    List<Usuario> usuarios = LerArquivoUsuarios.lerUsuarios();
    List<Projeto> projetos = LerArquivoProjetos.lerProjetos();
    List<Equipe> equipes = LerArquivoEquipes.lerEquipes();




        // INICIO DO PROGRAMA ( QUANDO O VALOR FOR DIFERENTE DE 0 O PROGRAMA TERMINA )



        while (inicioprograma == 0){
            int opcao_menu = 0;



            // OBJETOS PARA CADASTROS
            cadastro_usuarios usuario = new cadastro_usuarios();
            cadastro_projetos projeto = new cadastro_projetos();
            cadastro_equipes equipe = new cadastro_equipes();

            cadastro_perfil salvarperfil = new cadastro_perfil();


            if (usuarioLogado[6] == null){
                System.out.println(" ");
                System.out.println("Aviso didático: para facilitar os testes, utilize a conta administrativa padrão. (apenas adm define o perfil de usuario)");
                System.out.println("Login: adm");
                System.out.println("Senha: adm123");
                System.out.println(" ");
                System.out.println("Escolha uma opção");
                System.out.println("1 - Login");
                System.out.println("2 - Criar um usuario");
                 opcao_menu = scanner.nextInt();
                 if (opcao_menu >= 3){
                     System.out.println("Numero invalido");
                     continue;
                 }



            } else if (usuarioLogado[6].equals("A definir")) {
                System.out.println("Procure um ADM para definir seu perfil");
                System.out.println("Escolha uma opção");
                System.out.println("1 - logout");
                System.out.println("2 - fechar programa");
                opcao_menu = scanner.nextInt();

                if (opcao_menu == 1) {
                    opcao_menu = 12;
                } else if (opcao_menu ==2) {
                    opcao_menu = 13;
                } else {
                    System.out.println("numero invalido");
                    continue;
                }


            } else if (usuarioLogado[6].equals("Colaborador")) {
                System.out.println("Usuario Logado: " + usuarioLogado[4]);
                System.out.println(" ");
                System.out.println("Escolha uma opção");
                System.out.println("1 - Equipes Cadastradas");
                System.out.println("2 - Visualizar projeto das suas equipes");
                System.out.println("3 - logout");
                System.out.println("4 - fechar programa");

                opcao_menu = scanner.nextInt();

                if (opcao_menu == 1){
                        opcao_menu = 6;
                } else if (opcao_menu == 2) {
                    opcao_menu = 7;
                } else if (opcao_menu == 3) {
                    opcao_menu = 12;
                } else if (opcao_menu ==4) {
                    opcao_menu = 13;
                } else {
                    System.out.println("numero invalido");
                    continue;
                }


            } else if (usuarioLogado[6].equals("Gerente")){
                System.out.println("Usuario Logado: " + usuarioLogado[4]);
                System.out.println(" ");

                System.out.println("Escolha uma opção");

                System.out.println("1 - Criar uma Equipe");
                System.out.println("2 - Criar um Projeto");
                System.out.println("3 - Equipes Cadastradas");
                System.out.println("4 - Visualizar projeto das suas equipes");
                System.out.println("5 - Listar todas equipes");
                System.out.println("6 - Listar todos projetos");
                System.out.println("7 - Relatorio do sistema");
                System.out.println("8 - Definir status dos seus projetos");
                System.out.println("9 - logout");
                System.out.println("10 - fechar programa");


                opcao_menu = scanner.nextInt();

                if (opcao_menu == 1){
                    opcao_menu = 3;
                } else if (opcao_menu == 2) {
                    opcao_menu = 4;
                } else if (opcao_menu == 3) {
                    opcao_menu = 6;
                }
                else if (opcao_menu == 4) {
                    opcao_menu = 7;
                }else if (opcao_menu == 5) {
                    opcao_menu = 9;
                }else if (opcao_menu == 6) {
                    opcao_menu = 10;
                }else if (opcao_menu == 7) {
                    opcao_menu = 11;
                }else if (opcao_menu == 9) {
                    opcao_menu = 12;
                }else if (opcao_menu == 10) {
                    opcao_menu = 13;
                } else if (opcao_menu == 8) {
                    opcao_menu = 15;
                }else {
                    System.out.println("Numero invalido");
                    continue;
                }


            } else if (usuarioLogado[6].equals("administrador")) {
                System.out.println("Usuario Logado: " + usuarioLogado[4]);
                System.out.println(" ");
                System.out.println("Escolha uma opção");

                System.out.println("1 - Definir perfil de usuarios novos");
                System.out.println("2 - Criar uma Equipe");
                System.out.println("3 - Criar um Projeto");
                System.out.println("4 - Equipes Cadastradas");
                System.out.println("5 - Visualizar projeto das suas equipes");
                System.out.println("6 - Listar todos usuarios do sistema");
                System.out.println("7 - Listar todas equipes");
                System.out.println("8 - Listar todos projetos");
                System.out.println("9 - Relatorio do sistema");
                System.out.println("10 - Mudar status dos projetos");
                System.out.println("11 - logout");
                System.out.println("12 - fechar programa");

                opcao_menu = scanner.nextInt();

                if(opcao_menu == 1){
                    opcao_menu = 5;
                } else if (opcao_menu == 2){
                    opcao_menu = 3;
                } else if (opcao_menu == 3) {
                    opcao_menu = 4;
                } else if (opcao_menu == 4) {
                    opcao_menu = 6;
                } else if (opcao_menu == 5) {
                    opcao_menu = 7;
                }else if (opcao_menu == 6) {
                    opcao_menu = 8;
                }else if (opcao_menu == 7) {
                    opcao_menu = 9;
                }else if (opcao_menu == 8) {
                    opcao_menu = 10;
                }else if (opcao_menu == 9) {
                    opcao_menu = 11;
                }else if (opcao_menu == 11) {
                    opcao_menu = 12;
                }else if (opcao_menu == 12) {
                    opcao_menu = 13;
                } else if (opcao_menu == 10) {
                    opcao_menu = 14;
                }  else {
                    System.out.println("Numero invalido");
                    continue;
                }
            }


            switch (opcao_menu){

                // ***************** Login ************************

                case 1:

                    scanner.nextLine();
                    System.out.println("Digite seu Login");
                    String login = scanner.nextLine();


                    System.out.println("Digite sua senha");
                    String senha = scanner.nextLine();


                    boolean logou = false;

                    for (Usuario u : usuarios) {
                        if (login.equals(u.login) && senha.equals(u.senha)) {
                            usuarioLogado[0] = u.nome;
                            usuarioLogado[1] = u.cpf;
                            usuarioLogado[2] = u.email;
                            usuarioLogado[3] = u.cargo;
                            usuarioLogado[4] = u.login;
                            usuarioLogado[5] = u.senha;
                            usuarioLogado[6] = u.perfil;


                            logou = true;

                        }

                    } if (!logou){
                    System.out.println("Login invalido");
                    System.out.println(" ");
                }

                    break;

                // ***************** CADASTRO DE USUARIOS ************************

                case 2:
                    scanner.nextLine();
                    System.out.println("Digite seu nome:");
                    usuario.nome = scanner.nextLine();

                    System.out.println("Digite seu CPF");
                    usuario.cpf = scanner.nextLine();


                    System.out.println("Digite seu Email");
                    usuario.email = scanner.nextLine();

                    System.out.println("Digite seu Cargo");
                    usuario.cargo = scanner.nextLine();




                    System.out.println("Digite seu Login");
                    int looplogin = 0;

                    while (looplogin == 0){
                        String inputlogin = scanner.nextLine();
                        boolean jaexiste = false;

                        for (Usuario u : usuarios){
                            if (u.login.equals(inputlogin)){
                                System.out.println("Login ja existe");
                                System.out.println(" ");
                                System.out.println("Digite um login:");
                                jaexiste = true;
                                break;
                            }
                        }

                        if (!jaexiste){
                            usuario.login = inputlogin;
                            looplogin = 1;
                        }
                    }





                    System.out.println("Digite sua Senha");
                    usuario.senha = scanner.nextLine();

                    usuario.perfil = "A definir";

                    usuario.salvar_usuario();
                    usuarios = LerArquivoUsuarios.lerUsuarios();

                    break;




                // ***************** CADASTRO DE EQUIPES ************************


                case 3:
                    String membrosescolhidos = "";
                    int quantidademembros = 0;

                    scanner.nextLine();
                    System.out.println("Digite o nome da equipe:");
                    equipe.nome_equipe = scanner.nextLine();

                    System.out.println("Descrição do projeto:");
                    equipe.descricao = scanner.nextLine();

                    System.out.println("Essa equipe tera quantos usuarios?:");
                    int quantidadeescolhida = scanner.nextInt();




                    scanner.nextLine();
                    for (Usuario u : usuarios){

                        if (quantidadeescolhida <= quantidademembros){
                            break;
                        } else if (quantidademembros ==  0) {
                            System.out.println("Digite o nome do usuario a ser adicionado (Digite apenas um nome por vez): ");
                            for (Usuario y : usuarios) {
                                System.out.println("Nome: " + y.login + " Cargo: " + y.cargo);
                            }

                            membrosescolhidos = scanner.nextLine();
                            quantidademembros++;
                        }else {
                            System.out.println("Digite o nome do usuario a ser adicionado (Digite apenas um nome por vez): ");
                            for (Usuario z : usuarios) {
                                System.out.println("Nome: " + z.login + " Cargo: " + z.cargo);
                            }
                            membrosescolhidos = membrosescolhidos + ";" + scanner.nextLine();
                            quantidademembros++;
                        }

                    }


                    equipe.membros = membrosescolhidos;


                    equipe.salvar_equipes();
                    equipes = LerArquivoEquipes.lerEquipes();



                    break;






                // ***************** CADASTRO DE PROJETOS ************************
                case 4:

                    scanner.nextLine();
                    System.out.println("Digite o nome do projeto:");
                    projeto.nome_projeto = scanner.nextLine();

                    System.out.println("Qual gerente responsavel pelo projeto:(Digito):");
                    String[] arrayusuarios = new String[equipes.size()];
                    int contador1 = 0;
                    int contador2 = 0;


                    for (Usuario u : usuarios){
                        if (u.perfil.equals("Gerente")){
                            arrayusuarios[contador1] = u.nome;
                            contador1++;
                        }
                    }

                    for (Usuario u : usuarios){
                        if (u.perfil.equals("Gerente")){
                            System.out.println( contador2 + " - Nome: " + u.nome + " Cargo: " + u.cargo);
                            contador2++;
                        }
                    }


                    int escolha1 = scanner.nextInt();
                    if (escolha1 >= equipes.size()){
                        System.out.println("Numero incorreto");
                        break;
                    }else {
                        projeto.nome_responsavel = arrayusuarios[escolha1];
                    }

                    scanner.nextLine();
                    System.out.println("Descrição do projeto:");
                    projeto.descricao = scanner.nextLine();


                    System.out.println("Data de inicio:");
                    projeto.data_inicio = scanner.nextLine();

                    System.out.println("Data de termino previsto:");
                    projeto.data_termino_previsto = scanner.nextLine();

                    System.out.println("Qual o status do projeto:(Digito)");
                    System.out.println("1 - Planejado ");
                    System.out.println("2 - Em andamento ");
                    System.out.println("3 - Concluido ");
                    System.out.println("4 - Cancelado ");

                    int menuprojeto = scanner.nextInt();

                    switch (menuprojeto){
                        case 1: projeto.status = "Planejado";
                            break;
                        case 2: projeto.status = "Em andamento";
                            break;
                        case 3: projeto.status = "Concluido";
                            break;
                        case 4: projeto.status = "Cancelado";
                            break;
                        default:
                            System.out.println("Numero incorreto");
                    }


                    System.out.println("Qual a equipe responsavel pelo projeto:(Digito)");

                    String[] arrayequipes = new String[equipes.size()];
                    int contador3 = 0;
                    int contador4 = 0;

                    for (Equipe e : equipes){
                        arrayequipes[contador3] = e.nome_equipe;
                        contador3++;
                    }

                    for (Equipe e : equipes){
                        System.out.println( contador4 + " - Equipe: " + e.nome_equipe + " Membros: " + e.membros);
                        contador4++;
                    }

                    int escolha2 = scanner.nextInt();
                    if (escolha2 >= equipes.size()){
                        System.out.println("Numero incorreto");
                        break;
                    }else {
                        projeto.equipe = arrayequipes[escolha2];
                        projeto.salvar_projetos();
                        projetos = LerArquivoProjetos.lerProjetos();
                    }



                    break;



                // ***************** Definir perfil de usuario ************************


                case 5:

                    for (Usuario u : usuarios) {
                        if (u.perfil.equals("A definir")) {
                            System.out.println("Defina um Perfil para " + u.nome + " :");
                            System.out.println("1 - Colaborador");
                            System.out.println("2 - Gerente");
                            System.out.println("3 - Administrador");
                            System.out.print("Digite a opção desejada: ");

                            int escolhaPerfil = scanner.nextInt();

                            switch (escolhaPerfil){
                                case 1:
                                    u.perfil = "Colaborador";
                                    break;
                                case 2:
                                    u.perfil = "Gerente";
                                    break;
                                case 3:
                                    u.perfil = "administrador";
                                    break;

                                default:
                                    System.out.println("Perfil invalido");
                                    break;
                            }
                        }
                    }

                    boolean encontrou = false;

                    for (Usuario u : usuarios) {

                        if (u.perfil.equals("A definir")) {
                            System.out.println(u.nome);
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Todos os perfis já foram definidos.");
                        System.out.println(" ");
                    }

                    salvarperfil.salvar_Perfil(usuarios);

                    break;



                // ***************** Ver Equipes que o usuario esta participando ************************
                case 6:
                    System.out.println(" ");
                    equipes_participando participando = new equipes_participando();
                    participando.equipesparticipando(equipes, usuarioLogado);
                    System.out.println(" ");

                    break;



                // ***************** Ver projetos que o usuario esta participando ************************


                case 7:
                    System.out.println(" ");
                    projetos_participando participandoprojeto = new projetos_participando();
                        participandoprojeto.projetosparticipando(equipes, projetos ,usuarioLogado);
                    System.out.println(" ");
                    break;





                // ***************** Todos usuarios do sistema ************************
                case 8:
                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" Todos usuarios  : ");
                    for (Usuario u : usuarios){
                        System.out.println(u.nome);
                    }

                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" ");

                    break;


                // ***************** Todas equipes do sistema ************************
                case 9:
                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" Todas Equipes: ");
                    for (Equipe e : equipes){
                        System.out.println(e.nome_equipe);
                    }

                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" ");
                    break;


                    // ***************** Todas projetos do sistema ************************
                case 10:
                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" Todos projetos: ");
                    for (Projeto p : projetos){
                        System.out.println(p.nome_projeto);
                    }

                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" ");

                    break;


                // ***************** Relatorio do sistema ************************
                case 11:
                    int somausuarios = 0;
                    for (Usuario u : usuarios) {
                        somausuarios++;
                    }

                    int somaequipes = 0;
                    for (Equipe e : equipes) {
                        somaequipes++;
                    }

                    int somaprojetos = 0;
                    int somaprojetosconcluidos = 0;
                    for (Projeto p : projetos) {
                        somaprojetos++;
                        if (p.status.equals("Concluido")) {
                            somaprojetosconcluidos++;
                        }
                    }

                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" ");
                    System.out.println("Relatório do sistema");
                    System.out.println("Total usuários: " + somausuarios);
                    System.out.println("Total equipes: " + somaequipes);
                    System.out.println("Total projetos: " + somaprojetos);
                    System.out.println("Projetos concluídos: " + somaprojetosconcluidos);
                    System.out.println(" ");
                    System.out.println("***************************");
                    System.out.println(" ");

                    break;



                // ***************** Logout ************************
                case 12:
                    usuarioLogado[6] = null;
                    System.out.println("Sessão encerrada com sucesso.");
                    System.out.println(" ");

                    break;

                // ***************** Fechar Porgrama ************************
                case 13:
                    inicioprograma = 1;
                    System.out.println("Finalizando programa");

                    break;

                // ***************** Mudar status dos projeto ************************
                case 14:
                    for(Projeto p : projetos){
                        System.out.println(" ");
                        System.out.println("****************** ");
                        System.out.println(" ");
                        System.out.println("Nome do projeto: " + p.nome_projeto);
                        System.out.println("Nome do responsavel: " + p.nome_responsavel);
                        System.out.println("DescriçãoÇ " + p.descricao);
                        System.out.println("Data inicio: " + p.data_inicio);
                        System.out.println("Data Termino: " +p.data_termino_previsto);
                        System.out.println("Status: " + p.status);
                        System.out.println("Equipe: " + p.equipe);
                        System.out.println(" ");
                        System.out.println("****************** ");
                        System.out.println(" ");

                        System.out.println("Mudar status desse projeto?");
                        System.out.println("1 - sim");
                        System.out.println("2 - Não");


                        int simounaostatus = scanner.nextInt();

                        switch (simounaostatus){
                            case 1:
                                System.out.println("Qual o novo status  do projeto:(Digito)");
                                System.out.println("Status Atual: " + p.status);
                                System.out.println("1 - Planejado ");
                                System.out.println("2 - Em andamento ");
                                System.out.println("3 - Concluido ");
                                System.out.println("4 - Cancelado ");

                                int scannernovostatus = scanner.nextInt();

                                switch (scannernovostatus){
                                    case 1:
                                        p.status = "Planejado";
                                        break;
                                    case 2:
                                        p.status = "Em andamento";
                                        break;
                                    case 3:
                                        p.status = "Concluido";
                                        break;
                                    case 4:
                                        p.status = "Cancelado";
                                        break;
                                }




                                break;



                            case 2:
                            continue;



                            default:
                                System.out.println("Numero invalido");
                                break;
                        }



                    }


                    cadastro_projetos.reescreverProjetos(projetos);

                    break;


                // ***************** Mudar status dos projeto gerente ************************

                case 15:

                    for(Projeto p : projetos){
                        if (usuarioLogado[4].equals(p.nome_responsavel)){
                            System.out.println(" ");
                            System.out.println("****************** ");
                            System.out.println(" ");
                            System.out.println("Nome do projeto: " + p.nome_projeto);
                            System.out.println("Nome do responsavel: " + p.nome_responsavel);
                            System.out.println("Descrição: " + p.descricao);
                            System.out.println("Data inicio: " + p.data_inicio);
                            System.out.println("Data Termino: " +p.data_termino_previsto);
                            System.out.println("Status: " + p.status);
                            System.out.println("Equipe: " + p.equipe);
                            System.out.println(" ");
                            System.out.println("****************** ");
                            System.out.println(" ");

                            System.out.println("Mudar status desse projeto?");
                            System.out.println("1 - sim");
                            System.out.println("2 - Não");


                            int simounaostatus = scanner.nextInt();

                            switch (simounaostatus){
                                case 1:
                                    System.out.println("Qual o novo status  do projeto:(Digito)");
                                    System.out.println("Status Atual: " + p.status);
                                    System.out.println("1 - Planejado ");
                                    System.out.println("2 - Em andamento ");
                                    System.out.println("3 - Concluido ");
                                    System.out.println("4 - Cancelado ");

                                    int scannernovostatus = scanner.nextInt();

                                    switch (scannernovostatus){
                                        case 1:
                                            p.status = "Planejado";
                                            break;
                                        case 2:
                                            p.status = "Em andamento";
                                            break;
                                        case 3:
                                            p.status = "Concluido";
                                            break;
                                        case 4:
                                            p.status = "Cancelado";
                                            break;
                                    }




                                    break;



                                case 2:
                                    continue;



                                default:
                                    System.out.println("Numero invalido");
                                    break;
                            }

                        }




                    }


                    cadastro_projetos.reescreverProjetos(projetos);

                    break;





                default:
                    System.out.println("Numero incorreto");
                    break;






            }

        }


        scanner.close();
    }
}
