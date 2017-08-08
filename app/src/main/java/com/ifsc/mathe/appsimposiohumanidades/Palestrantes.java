package com.ifsc.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Palestrantes extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestrantes);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Palestrantes");

    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Prof. Ms. Allan Kenji Seki");//OK
        listDataHeader.add("Prof(a). Ana Maria Said");//OK
        listDataHeader.add("Arnaldo Luiz Milan");//OK
        listDataHeader.add("Prof. Ms. Cícero Santiago de Oliveira");//OK
        listDataHeader.add("Prof. Dr. Davis Moreira Alvim");//OK
        listDataHeader.add("Dharla Raupp Kamers"); //OK
        listDataHeader.add("Prof. Ms. Emerson Martins");//OK
        listDataHeader.add("Gabriela Lader");//OK
        listDataHeader.add("Prof. Ms. Gabriel Moraes De Bem");//OK
        listDataHeader.add("Prof(a). Ms. Izabel Rizzi Mação");//OK
        listDataHeader.add("Prof. Dr. Joel José de Souza"); //OK
        listDataHeader.add("Lucas Luan Gomes");//OK
        listDataHeader.add("Prof(a). Dr(a). Maressa Danielli Dolzan");//OK
        listDataHeader.add("Profa. Msa. Maria Lucila Horn");//OK
        listDataHeader.add("Prof. Esp. Mauro Antônio do Nascimento");//OK
        listDataHeader.add("Prof(a). Ms(a). Micheline Barros");//OK
        listDataHeader.add("Michelle K. Vianna");//OK
        listDataHeader.add("Prof(a). Dr(a). Mônica Ribeiro da Silva");//OK
        listDataHeader.add("Nei d´ Ogum ");//OK
        listDataHeader.add("Prof(a). Dra. Olinda Evangelista");//OK
        listDataHeader.add("Ms(a). Patrícia Maccar");//OK
        listDataHeader.add("Prof. Ms. Paulo Henrique Schlickmann");//OK
        listDataHeader.add("Prof(a). Quéli Flach Anschau");//OK
        listDataHeader.add("Rafael Ferreira da Silva");//OK
        listDataHeader.add("Profa. Msa. Renata Lucia Batista Flores");//OK
        listDataHeader.add("Babalorixá Ricardo Osanha Agué");//OK
        listDataHeader.add("Profa. Msa. Roberta Costa Ribeiro da Silva");//OK
        listDataHeader.add("Prof. Sandro Luiz Bazzanella");//OK
        listDataHeader.add("Prof. Dr. Vilson Cesar Schenato");//OK


        // Adding child data
        List<String> allankenji =new ArrayList<String>();
        allankenji.add("Possui graduação em Psicologia pela Universidade Federal de Santa Catarina (2011) e mestrado em Educação, Estado e Políticas Públicas pela Universidade Federal de Santa Catarina (2014). Atualmente é representante da Universidade Federal de Santa Catarina. Tem experiência na área de Educação, com ênfase em Política Educacional, atuando principalmente nos seguintes temas: políticas públicas em educação, universidade, marxismo, mais educação e teoria do valor.");

        List<String> anamaria =new ArrayList<String>();
        anamaria.add("Possui graduação em Filosofia pela Pontifícia Universidade Católica de Campinas (1980), mestrado em Filosofia pela Universidade Estadual de Campinas (1989) e doutorado em Educação, na área Educação, Sociedade, Política e Cultura, pela Universidade Estadual de Campinas (2006). Pesquisa de 1 ano no Istituto Gramsci - Roma - It, em 1993. Fez pós-doutorado em Roma-It, na Universitá degli Studi di Roma &quot;Tor Vergata&quot; (2008), com bolsa CAPES. Publicou em 2009 o livro: &quot;Uma estratégia para o ocidente: o conceito de democracia em Gramsci e o PCB&quot;. Atualmente é professor titular da Universidade Federal de Uberlândia. Coordena um grupo de estudos do CNPQ: Grupo de estudos marxistas:Marx e Gramsci.É membro do grupo de estudiosos marxistas ligado à Fondazione Gramsci dellEmilia-Romagna (www.iger.org), coordenado pela Profa. Rita Medici, desde 2011. Organizou o livro em 2014: &quot;Pensar a sociedade contemporânea - a atualidade do pensamento de Marx e Gramsci&quot;.É professora da pós-graduação em Filosofia do Instituto de Filosofia da UFU. Tem experiência na área de Filosofia, com ênfase em Política, atuando principalmente nos seguintes temas: Filosofia, Política, Educação, Marx, Antonio Gramsci, Contemporaneidade e Democracia. Aprovada em concurso para Professor Titular em 10/09/2015.");

        List<String> arnaldoluiz =new ArrayList<String>();
        arnaldoluiz.add("Economista e Assessor Territorial para Gestão Social no Território da Cidadania Planalto Norte Catarinense/NEDET");

        List<String> cicerosantiago  =new ArrayList<String>();
        cicerosantiago.add("Possui graduação em História Licenciatura Plena pela Universidade Federal de Santa Maria (2004) e mestrado em Programa de Pós-Graduação em Educação pela Universidade Federal de Santa Maria (2009). Atualmente é professor do Instituto Federal de Educação Ciência e Tecnologia de Santa Catarina. Tem experiência na área de Educação, com ênfase em Administração de Unidades Educativas, atuando principalmente nos seguintes temas: educação de jovens e adultos, educação popular, pré-vestibular popular, ensino de história e cidadania.");

        List<String> davismoreira =new ArrayList<String>();
        davismoreira.add("Possui graduação em História pela Universidade Federal do Espírito Santo (2000), mestrado em História Social das Relações Políticas pela Universidade Federal do Espírito Santo (2004), doutorado em Filosofia pela Pontifícia Universidade Católica de São Paulo (2011) e está pós-doutorando em Psicologia Institucional pela Universidade Federal do Espírito Santo (2016). É professor efetivo do Instituto Federal do Espírito Santo (Ifes), campus Linhares, do Programa de Pós-Graduação em Ensino de Humanidades (Ifes), campus Vitória, e do Programa de Psicologia Institucional (Ufes). É líder do grupo de pesquisa Educação Contemporânea: diversidade, crítica e transformação (Ifes) e pesquisador do grupo Tecnologias e processos de subjetivação (Unesp). Membro do Grupo de Estudos e Pesquisas em Sexualidade da Ufes, do Núcleo de Pesquisa em Sexualidade da Ufes e do Coletivo Colorifes.");

        List<String> dharlaraupp =new ArrayList<String>();
        dharlaraupp.add("Artista Raup - Coletivo CURA");

        List<String> emersonmartins  =new ArrayList<String>();
        emersonmartins.add("É professor Assistente II na Universidade da Fronteira Sul (UFFS), na área de Ciências Sociais e Ciência Política. É doutorando do Programa de Pós-Graduação em Psicologia pela Universidade Federal de Santa Catarina (UFSC) e possui mestrado em Sociologia Política (UFSC). Tem experiência na área de Sociologia Política, com ênfase em políticas educacionais inclusivas, atuando principalmente nos seguintes temas: participação política, relações interétnicas, orientação sexual, gênero, masculinidades, educação,violências, novas tecnologias de informação e comunicação (NTI) e cultura surda.");

        List<String> gabrielmoraes  =new ArrayList<String>();
        gabrielmoraes.add("Mestre em Arquitetura e Urbanismo pela Universidade Federal de Santa Catarina - UFSC (2016) e Tecnólogo em Construção de Edifícios pelo Instituto Federal de Santa Catarina - IFSC (2008). Desenvolve pesquisas nas áreas de: acessibilidade, design inclusivo, desenho universal, prototipagem rápida e fabricação digital. Atua no mercado de Gerenciamento, Planejamento e Execução de Obras de Construção Civil e Arquitetura Efêmera.");

        List<String> gabrielalader =new ArrayList<String>();
        gabrielalader.add("Graduada em Agronomia pela Universidade Tecnológica Federal do Paraná (2004). Pós Graduanda em Desenvolvimento Rural Sustentável pelo Instituto Federal de Santa Catarina (2016-2017). Experiencia com assistência técnica e extensão rural, planejamentos estratégicos participativos, elaboração de projetos técnicos, direcionando trababalhos ao desenvolvimento e organização da agricultura familiar. Atuação em atividades de pesquisa envolvendo a produção de dados, informações e conhecimentos; da difusão de métodos e tecnologias sociais; assessoria ao Colegiado Territorial e o acompanhamento das iniciativas de desenvolvimento territorial do Ministério do Desenvolvimento Agrário no âmbito do Programa Desenvolvimento Regional, Territorial Sustentável e Economia Solidária e articulação das políticas públicas.");


        List<String> izabelrizzi =new ArrayList<String>();
        izabelrizzi.add("Possui graduação em História/Licenciatura Plena e Bacharelado pelo Centro de Ensino Superior Anísio Teixeira (2009) e Mestrado em História pela Universidade Federal do Espírito Santo (2016). Possui experiência com Ensino Fundamental, Médio, Educação de Jovens e Adultos e Ensino Superior. Tem pesquisa e artigos publicados na área de História das Relações de Poder, Política e Pós-Modernidade, Filosofia Contemporânea, História de Gênero e Literatura e História.");

        List<String> joeljose =new ArrayList<String>();
        joeljose.add("Professor do Instituto Federal de Santa Catarina, possui graduação em Geografia pela Universidade Federal de Santa Catarina (2006), mestrado em Geografia pela Universidade Federal de Santa Catarina (2009), doutor em Geografia pela Universidade Federal de Santa Catarina (2014). Atualmente e participa de grupos de pesquisa na Universidade Federal de Santa Catarina, Instituto Federal de Santa Catarina e Universidade Federal da Integração Latino-Americana. Tem experiência na área de Geografia, como professor de Ensino básico, médio, EJA e Ensino Superior a Distância. Como pesquisador atua na área de desenvolvimento regional e urbano, com ênfase em Geografia Econômica e Rural, atuando nos seguintes temas: industrialização, laticínios e agroindústria.");

        List<String> lucasluan = new ArrayList<String>();
        lucasluan.add("");

        List<String> maressadanielli =new ArrayList<String>();
        maressadanielli.add("Graduada em Química pela Universidade Federal de Santa Catarina (UFSC) com habilitação em Licenciatura, Bacharel e Química Tecnológica. Mestre e Doutora pelo Departamento de Química da UFSC, tese defendida em abril de 2016. Pós-graduação desenvolvida com ênfase em Química Analítica, onde atuou na área de Separações, com técnicas cromatográficas e eletroforéticas. Pelo período de um ano (2013-2014) realizou doutorado-sanduiche nos EUA, na University of Texas at Arlington, sob a supervisão do Prof. Dr. Daniel W. Armstrong, tendo atuado, principalmente, no desenvolvimento de fases estacionárias para HPLC e colunas cromatográficas preenchidas com partículas de sílica superficialmente porosas; separações enantioméricas e em modo HILIC. Tem experiência no desenvolvimento de métodos analíticos utilizando HPLC-MS/MS, HPLC-UV, CE-UV e GC-FID. Atualmente é membro efetivo do corpo docente do Instituto Federal de Santa Catarina, Campus Canoinhas, atuando nos cursos Técnico Integrado em Alimentos e Superior de Tecnologia em Alimentos.");

        List<String> marialucila =new ArrayList<String>();
        marialucila.add("Artista, curadora, arte educadora. Licenciada em Artes Visuais pela Universidade do Estado de Santa Catarina (1988), Aperfeiçoamento em Pintura (1994), Especialização em Arte e ciências Humanas (2001), especialização em Fotografia e Imagem em Movimento (2012) e mestrado em Educação e Cultura pela Universidade do Estado de Santa Catarina (2006). Atualmente é doutoranda do Programa de pós-graduação em educação - PPGE/UDESC, membro do grupo de pesquisa ''Arte, Formação e tecnologias nos processos contemporâneos'' e coordenadora do Núcleo de Estudos em Fotografia e Arte. Tem experiência na área de Artes, com ênfase em linguagem visual e fotografia, atuando principalmente nos seguintes temas: arte, fotografia, pintura, educação e educação a distância.");

        List<String> mauroantonio =new ArrayList<String>();
        mauroantonio.add("Bacharel e Licenciado em Filosofia pela Universidade Federal de Uberlândia/UFU. Especialista em Ensino de Filosofia pela Universidade do Oeste \tPaulista/UNOESTE. Mestrando em Educação Profissional e Tecnológica em Rede Nacional (ProfEPT). Professor de Filosofia do Instituto Federal de Santa \tCatarina-IFSC com dedicação excluisiva. Coordenador do Núcleo de Cultura e Arte (NuCA) do Campus Canoinhas/IFSC e do projeto de Extensão IFSC SESC em \tAtos. Autor do livro Ser e Declínio e organizador do livro Aproximação-Distância. Foi sócio fundador e administrador da empresa Agência Arte \tProdutora e responsável pela concepção e produção executiva dos projetos: Bienal de Arte do Triângulo, Congresso de Arte e Produção Cultural do \tTriângulo e Alto Paranaíba, Simpósio de Arte e Produção Cultural de Uberlândia.");

        List<String> michelinebarros =new ArrayList<String>();
        michelinebarros.add("Possui Mestrado em Educação e Cultura (2006), com dissertação na área de Historia da Arte em Santa Catarina, é especialista em Linguagem Plástica Contemporânea(2001) e graduada em Educação Artística - Habilitação Artes Plásticas (1997), todos na Universidade do Estado de Santa Catarina UDESC. Atualmente é professora efetiva no Instituto Federal de Santa Catarina - Campus Canoinhas. Deixou a rede municipal de Ensino de Florianópolis depois de 11 anos, em 2016. Foi professora colaboradora no Centro de Artes CEART UDESC (2001e 2013) e professora colaboradora do Centro de Educação a Distância CEAD UDESC (2002 a 2008 e 2012). Autora do Caderno pedagógico EAD Arte e Desenvolvimento Infantil. Foi Presidente da Associação dos Arte-Educadores de Santa Catarina - AAESC 2008-2009 e representantou os Arte-educadores no Conselho Estadual de Cultura CEC entre 2008 e 2009. Criou a carteira do Arte educador que identifica o profissional, professor de Artes, de qualquer linguagem a entrar com descontos em eventos culturais (2009). Autora do livro ''Vera Sabino: Intuição e Arte'' pela Editora Letras Contemporâneas em Julho de 2011.");

        List<String> michellevianna =new ArrayList<String>();
        michellevianna.add("Terapeuta Holística e Life Coaching");


        List<String> monicaribeiro = new ArrayList<>();
        monicaribeiro.add("Pós-doutorado em andamento na Faculdade de Educação da UNICAMP. Doutorado em Educação: História, Política e Ciências Sociais pela Pontifícia Universidade Católica de São Paulo (2003). Mestrado em Educação: Fundamentos da Educação pela Universidade Federal de São Carlos (1991) e Graduação em Pedagogia com habilitação em Administração Escolar pela Universidade Estadual Paulista Júlio de Mesquita Filho - UNESP Araraquara (1989). Professora na Universidade Federal do Paraná (1994 até o presente). Atua nos cursos de formação de professores e no Programa de Pós-Graduação em Educação - Mestrado e Doutorado. Tem interesse no campo de pesquisa em Políticas Educacionais com ênfase para o Ensino Médio e na avaliação de políticas públicas. Coordenadora do Grupo de Pesquisa Observatório do Ensino Médio. Chefe do Departamento de Planejamento e Administração Escolar (2005 a 2007). Vice-coordenadora do Programa de Pós-graduação em Educação da UFPR (2011-2012). Coordenadora do Programa de Pós-graduação em Educação (janeiro de 2013 a março de 2016). Vice-coordenadora do Fórum Sul de Coordenadores de Programas de Pós-Graduação em Educação (outubro 2015 a março 2016). Coordenadora do DINTER - Doutorado Interinstitucional - entre a UFPR e Universidade Federal do Acre com financiamento pela Capes (2013-2016). Coordenadora da produção dos materiais de formação continuada de professores do Pacto Nacional pelo Fortalecimento do Ensino Médio junto ao Ministério da Educação (2103-2014). Revisora de periódicos dentre eles Educação & Sociedade, Ensaio (Fundação Cesgranrio) e Revista Brasileira de Educação. Membro do Conselho Consultivo do periódico Educar em Revista. Parecerista ad hoc das seguintes agências de fomento: Capes, CNPq e Fundação Araucária. Pesquisadora do CNPq - bolsista produtividade PQ2. Atualmente supervisiona 2 pesquisas de pós-doutorado, orienta 6 teses de doutorado e 2 dissertações de mestrado. Coordenou a XI ANPEd Sul (Reunião Científica Regional da ANPEd) realizada em Curitiba de 24 a 27 de julho de 2016. Integrante do Movimento Nacional em Defesa do Ensino Médio. Vice-líder do Grupo de Pesquisa EMPesquisa - Pesquisas sobre Ensino Médio com sede na Unicamp e participação de pesquisadores de oito universidades brasileiras.");

        List<String> neid  =new ArrayList<String>();
        neid.add("Militante Direitos Humanos");

        List<String> olindaevangelista =new ArrayList<String>();
        olindaevangelista.add("Possui graduação em Filosofia pela Universidade Federal do Paraná (1980), mestrado em Educação: História, Política, Sociedade pela Pontifícia Universidade Católica de São Paulo (1988) e doutorado em Educação: História, Política, Sociedade pela Pontifícia Universidade Católica de São Paulo (1997). Realizou Estágio Pós-doutoral na Universidade do Minho, Braga, PT. Atualmente é professor aposentado da Universidade Federal de Santa Catarina e Voluntária no PPGE-CED-UFSC. Tem experiência na área de Educação, com ênfase em Educação, atuando principalmente nos seguintes temas: política educacional, formação docente, educação, política de educação e história da educação.");

        List<String>  patriciamaccar =new ArrayList<String>();
        patriciamaccar.add("É licenciado em Geografia pela Universidade do Sul de Santa Catarina (2009), Mestre em Geografia - Desenvolvimento Regional e Urbano - com \tdissertação sobre as dinâmicas geoeconômicas das indústrias de plástico da região Sul de Santa Catarina, com enfase em São Ludgero - SC, pela \tUniversidade Federal de Santa Catarina (2012). Atualmente é doutorando do Programa de Pós Graduação em Geografia da Universidade Federal de Santa \tCatarina, com pesquisa em andamento sobre as indústrias petroquímicas do Brasil, com enfase na Cadeia Produtiva petroquímica, sua dinâmica \tgeoeconômica, internacionalização e competitividade. Tem experiência no ensino superior pela Universidade Federal de Santa Catarina (UFSC) nos cursos \tde Geografia e Pedagogia (Estágios e Prática de Ensino). Atualmente participa como estudante do grupo de estudos Formação Sócio Espacial: Progresso \tTécnico e Desenvolvimento Econômico, e também participa como pesquisador do grupo de estudo Geografia e processos educativos.");

        List<String> paulohenrique =new ArrayList<String>();
        paulohenrique.add("É licenciado em Geografia pela Universidade do Sul de Santa Catarina (2009), Mestre em Geografia - Desenvolvimento Regional e Urbano - com \tdissertação sobre as dinâmicas geoeconômicas das indústrias de plástico da região Sul de Santa Catarina, com enfase em São Ludgero - SC, pela \tUniversidade Federal de Santa Catarina (2012). Atualmente é doutorando do Programa de Pós Graduação em Geografia da Universidade Federal de Santa \tCatarina, com pesquisa em andamento sobre as indústrias petroquímicas do Brasil, com enfase na Cadeia Produtiva petroquímica, sua dinâmica \tgeoeconômica, internacionalização e competitividade. Tem experiência no ensino superior pela Universidade Federal de Santa Catarina (UFSC) nos cursos \tde Geografia e Pedagogia (Estágios e Prática de Ensino). Atualmente participa como estudante do grupo de estudos Formação Sócio Espacial: Progresso \tTécnico e Desenvolvimento Econômico, e também participa como pesquisador do grupo de estudo Geografia e processos educativos.");

        List<String> queliflach =new ArrayList<String>();
        queliflach.add("Graduada em Serviço Social pela Fundação Universidade Regional de Blumenau (2003) Mestre em Sociologia Política pela Universidade Federal de Santa Catarina (2008). e atualmente é doutoranda em Serviço Social no Curso de Pós Gradução em Serviço Social da Universidade Federal de Santa Catarina. Membro do NISFAP Núcleo de Pesquisa Interdisciplinar Sociedade, Família e Política Social. Foi professora substituta da Universidade Federal de Santa Catarina e Federal do Paraná. Gestora da política de Assistência Social, Coordenadora da Alta complexidade do SUAS.");

        List<String> rafaelferreira =new ArrayList<String>();
        rafaelferreira.add("Artista Crione – Coletivo CURA");

        List<String> renatalucia =new ArrayList<String>();
        renatalucia.add("Professora do quadro efetivo do Colégio de Aplicação da Universidade Federal do Rio de Janeiro - CAp/UFRJ. Graduada em Pedagogia pela Universidade do Estado do Rio de Janeiro (1998). Mestre em Educação pelo Programa de Pós-Graduação em Educação da Universidade do Estado do Rio de Janeiro - ProPED/UERJ - (2011). Coordenadora do Curso de Extensão Conversas entre Professores das Séries Iniciais do Ensino Fundamental, que ocorre no CAp/UFRJ. Membro integrante do Coletivo de Estudos em Marxismo e Educação - COLEMARX - da Universidade Federal do Rio de Janeiro. Co-coordenadora do Grupo de Pesquisa ConPAS - Conversas entre Professores: Alteridades e Singularidades. Doutoranda em Educação no Programa de Pós-Graduação em Educação da Universidade Federal de Santa Catarina - PPGE/UFSC.");

        List<String> ricardoosanha =new ArrayList<String>();
        ricardoosanha.add("");

        List<String> robertacosta =new ArrayList<String>();
        robertacosta.add("Possui graduação pela Universidade Federal do Rio Grande do Sul (2005). Tem experiência na área de Arquitetura e Urbanismo, com ênfase em Arquitetura e Urbanismo, atuando principalmente no lançamento de idéias, criação, desenvolvimento e detalhamento de projetos de stands, residências, interiores, móveis modulados. Trabalhou durante um ano como professora substituta do Curso Técnico em Edificações do IFSC, Câmpus Florianópolis e atualmente atua como docente efetiva do Curso Técnico em Edificações do IFSC, Câmpus Canoinhas.");

        List<String> sandroluiz = new ArrayList<String>();
        sandroluiz.add("Possui graduação em Filosofia pela Faculdade de Filosofia, Ciências e Letras Dom Bosco (1989), mestrado em Educação e Cultura pela Universidade do Estado de Santa Catarina (2003) e doutorado em Interdisciplinar em Ciências Humanas pela Universidade Federal de Santa Catarina (2010). Atualmente é professor titular de filosofia da Universidade do Contestado na graduação no Programa de Mestrado em Desenvolvimento Regional. Tem experiência na área de filosofia, atuando nas seguintes áreas temáticas: História da filosofia, filosofia política e ética, técnica, Estado e biopolítica.");

        List<String> vilsoncesar = new ArrayList<String>();
        vilsoncesar.add("Doutor em Ciências Sociais pela Universidade Federal de Campina Grande - UFCG, possui Mestrado em Ciências Sociais pela mesma instituição (2010). É graduado em Ciências Sociais pela Universidade Estadual do Oeste do Paraná (2003) e especialista em História e Região também pela UNIOESTE (2005). Professor efetivo de Sociologia no Instituto Federal de Santa Catarina. Tem experiência docente em Sociologia e Antropologia. Enquanto pesquisador se concentra nos seguintes temas: Teoria Sociológica; Campesinato, Grupos Sociais Rurais; Oeste Paranaense; Agreste Paraibano; Construções Identitárias e Relações Sócio-culturais; Direitos Humanos; Educação, Trabalho e Realidade Brasileira. Líder do Grupo de Pesquisa: Identidades, Desenvolvimento e Democracia (Certificado pelo CNPq).");

        // ATUALIZAR OS INDICES
        listDataChild.put(listDataHeader.get(0), allankenji);
        listDataChild.put(listDataHeader.get(1), anamaria);
        listDataChild.put(listDataHeader.get(2), cicerosantiago);
        listDataChild.put(listDataHeader.get(3), davismoreira);
        listDataChild.put(listDataHeader.get(4), dharlaraupp);
        listDataChild.put(listDataHeader.get(5), emersonmartins);
        listDataChild.put(listDataHeader.get(6), gabrielalader);
        listDataChild.put(listDataHeader.get(7), gabrielmoraes);
        listDataChild.put(listDataHeader.get(8), izabelrizzi);
        listDataChild.put(listDataHeader.get(9), joeljose);
        listDataChild.put(listDataHeader.get(10), lucasluan);
        listDataChild.put(listDataHeader.get(11), maressadanielli);
        listDataChild.put(listDataHeader.get(12), marialucila);
        listDataChild.put(listDataHeader.get(13), mauroantonio);
        listDataChild.put(listDataHeader.get(14), michelinebarros);
        listDataChild.put(listDataHeader.get(15), michellevianna);
        listDataChild.put(listDataHeader.get(16), monicaribeiro);
        listDataChild.put(listDataHeader.get(17), neid);
        listDataChild.put(listDataHeader.get(18), olindaevangelista);
        listDataChild.put(listDataHeader.get(19), patriciamaccar);
        listDataChild.put(listDataHeader.get(20), paulohenrique);
        listDataChild.put(listDataHeader.get(21), queliflach);
        listDataChild.put(listDataHeader.get(22), rafaelferreira);
        listDataChild.put(listDataHeader.get(23), renatalucia);
        listDataChild.put(listDataHeader.get(24), ricardoosanha);
        listDataChild.put(listDataHeader.get(25), robertacosta);
        listDataChild.put(listDataHeader.get(26), sandroluiz);
        listDataChild.put(listDataHeader.get(27), vilsoncesar); // Header, Child data

    }
}
