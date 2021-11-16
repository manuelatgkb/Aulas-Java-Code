package modulo4.aula37.view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modulo3.ExerciciosExtra.R10.Domain.Categoria;
import modulo4.aula37.view.dao.CategoriaDao;

public class ViewDesktop extends JFrame{
private CategoriaDao dao;
private Container container;
private JLabel lbNome;
private JTextField txtNome;
private JButton btnSalvar, btnDelete, btnUpdate;
private JTable table;
private DefaultTableModel tableModel;


    public ViewDesktop(){
        super("Categorias");
        setLayout(null);

        inicializaComponentes();
        posicionamento();
        
        adicionaEventos();

        ler();
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void inicializaComponentes(){
        dao = new CategoriaDao();
        container = getContentPane();
        lbNome = new JLabel("Nome:");
        txtNome = new JTextField();
        btnSalvar = new JButton("Salvar");
        btnDelete = new JButton("Deletar");
        btnUpdate = new JButton("Atualizar");
        table = new JTable();
        tableModel = (DefaultTableModel)table.getModel();
        tableModel.addColumn("id");
        tableModel.addColumn("nome");
        }

    private void posicionamento(){
        lbNome.setBounds(10,10,50,20);
        txtNome.setBounds(70, 10, 250, 20);
        btnSalvar.setBounds(10, 40, 100, 20);
        table.setBounds(10, 80, 700, 300);
        btnDelete.setBounds(10, 400, 100, 20);
        btnUpdate.setBounds(115, 400, 100, 20);

        container.add(lbNome);
        container.add(txtNome);
        container.add(btnSalvar);
        container.add(table);
        container.add(btnDelete);
        container.add(btnUpdate);
    }

    private void adicionaEventos(){
        btnSalvar.addActionListener(new aActionListener()){
            @Override
            public void actionPerformed(ActionEvent e) {
                Categoria model = new Categoria();
                model.setNome(txtNome.getText());
                salvar(model);
            }
        }
    }

    lbNome.setBounds(10,10,50,20);
        txtNome.setBounds(70, 10, 250, 20);
        txtNome.setBounds(10, 40, 100, 20);
        table.setBounds(10, 80, 700,300);


        btnSalvar.addActionListener(new aActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Categoria model = new Categoria();
                model.setNome(txtNome.getText());
                salvar(model);
            }
        });

        btnDelete.addActionListener(new aActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int id = (int)table.getValueAt(table.getSelectedRow(), 0);
                Categoria model = new Categoria();
                model.setId(id);
                delete(model);
                //JOptionPane.showMessageDialog(container, "Categoria de id :  "+ model.getId() + "Deletado com sucesso!");
            }
        });
    }


    btnUpdate.addActionListener(new aActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int id = (int)table.getValueAt(table.getSelectedRow(), 0);
            Categoria model = new Categoria();
            model.setId(id);
            model.setNome("nome");
            alterar(model);
            JOptionPane.showMessageDialog(container, "Categoria de id :  "+ model.getId() + "Deletado com sucesso!");
        }
    });
}

//==================================CRUD========================================
    private void salvar(Categoria model){
        dao.insert(model);
        JOptionPane.showMessageDialog(container, "Categoria:" + model.getNome()+ "Salva com sucesso!");
        ler();
    }

    private void ler(){
        tableModel.setRowCount(0);
        for (Categoria c : dao.read()) {
            tableModel.addRow(new Object[]{c.getId(), c.getNome()});
        }

    }

    private void delete(Categoria model){
        dao.delete(model);
        JOptionPane.showMessageDialog(container, "Categoria:" + model.getId()+ "Deletado com sucesso");
        ler();
    }
}
