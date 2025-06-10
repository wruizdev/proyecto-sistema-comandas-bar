/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daw127
 */
public class crudsql {

    conexionsql con = new conexionsql();
    ResultSet result;

    public void insertarCamarero(String codigo, String nombre, String apellido, String puesto) {
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "insert into camareros(cod_camarero, nombre, apellido, puesto) values('" + codigo + "', '" + nombre + "', '" + apellido + "','" + puesto + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarCamarero(String codigo) {
        try {
            Connection conexion = con.conectar();
            String sql = "delete from camareros where cod_camarero = '" + codigo + "'";
            java.sql.Statement st = conexion.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Camarero eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);

            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de búsqueda" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public DefaultTableModel mostrarCamareros() {
        String[] nombresColumnas = {"cod_camarero", "nombre", "apellido", "puesto"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select * from camareros;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_camarero");
                registros[1] = result.getString("nombre");
                registros[2] = result.getString("apellido");
                registros[3] = result.getString("puesto");
                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public void registrarPlato(String codigo, String categoria, String nombre, double precio) {
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "insert into platos(cod_plato, categoriaplatos, nombreplato, precio) values('" + codigo + "', '" + categoria + "', '" + nombre + "', '" + precio + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarPlato(String codigo) {
        try {
            Connection conexion = con.conectar();
            String sql = "delete from platos where cod_plato = '" + codigo + "'";
            java.sql.Statement st = conexion.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Plato eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);

            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de búsqueda" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public DefaultTableModel mostrarPlatos() {
        String[] nombresColumnas = {"cod_plato", "categoriaplatos", "nombreplato", "precio"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select * from platos;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_plato");
                registros[1] = result.getString("categoriaplatos");
                registros[2] = result.getString("nombreplato");
                registros[3] = result.getString("precio");
                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public void MostrarMesasCombo(JComboBox comboMesas) {
        try {
            Connection conexion = con.conectar();
            String sql = "select * from mesas;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
//            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);
            while (result.next()) {
                comboMesas.addItem(result.getString("cod_mesa"));

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarCamarerosCombo(JComboBox comboCamareros) {
        try {
            Connection conexion = con.conectar();
            String sql = "select * from camareros;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
//            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);
            while (result.next()) {
                comboCamareros.addItem(result.getString("nombre"));

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarCodigoCamarero(JComboBox camarerosCombo, JTextField codigoCamarero) {
        try {
            Connection conexion = con.conectar();
            String sql = "select camareros.cod_camarero from camareros where camareros.nombre = ?;";
            PreparedStatement st = conexion.prepareStatement(sql);
            st.setString(1, camarerosCombo.getSelectedItem().toString());

            ResultSet result = st.executeQuery();
            if (result.next()) {
                codigoCamarero.setText(result.getString("cod_camarero"));
            }
            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarComanda(int codigoComanda, String codigoMesa, String codigoCamarero, LocalDate fecha) {
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "insert into comandas(cod_comanda, cod_mesa, cod_camarero, fecha_comanda) values('" + codigoComanda + "', '" + codigoMesa + "', '" + codigoCamarero + "','" + fecha + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

    public DefaultTableModel mostrarPlatosComanda() {
        String[] nombresColumnas = {"cod_plato", "nombreplato", "seleccionar", "cantidad"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select platos.cod_plato, platos.nombreplato from platos;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_plato");
                registros[1] = result.getString("nombreplato");

                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public void insertarPlatosComanda(String codigoPlato, String codigoComanda, int cantidad) {
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "insert into platoscomandas(cod_plato, cod_comanda, cantidad) values('" + codigoPlato + "', '" + codigoComanda + "', '" + cantidad + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }

    public DefaultTableModel mostrarComanda(String codigoComanda) {
        String[] nombresColumnas = {"cod_comanda", "Mesa", "Plato", "Cantidad", "Categoria", "Fecha"};
        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select platoscomandas.cod_comanda, comandas.cod_mesa, platos.nombreplato, platoscomandas.cantidad, platos.categoriaplatos, comandas.fecha_comanda\n"
                    + "from comandas\n"
                    + "join platoscomandas on comandas.cod_comanda = platoscomandas.cod_comanda\n"
                    + "join platos on platoscomandas.cod_plato = platos.cod_plato\n"
                    + "where comandas.cod_comanda = '" + codigoComanda + "';";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_comanda");
                registros[1] = result.getString("cod_mesa");
                registros[2] = result.getString("nombreplato");
                registros[3] = result.getString("cantidad");
                registros[4] = result.getString("categoriaplatos");
                registros[5] = result.getString("fecha_comanda");

                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public void eliminarComanda(String codigoComanda) {
        try {
            Connection conexion = con.conectar();
            String sql = "delete from comandas where comandas.cod_comanda = '" + codigoComanda + "'";
            java.sql.Statement st = conexion.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Comanda eliminada correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);

            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de búsqueda" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public DefaultTableModel mostrarComandas() {
        String[] nombresColumnas = {"Comanda", "Mesa", "Camarero", "Fecha"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select comandas.cod_comanda, comandas.cod_mesa, camareros.nombre, comandas.fecha_comanda\n"
                    + "from comandas\n"
                    + "join camareros on comandas.cod_camarero = camareros.cod_camarero;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_comanda");
                registros[1] = result.getString("cod_mesa");
                registros[2] = result.getString("nombre");
                registros[3] = result.getString("fecha_comanda");
                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public DefaultTableModel mostrarTodasComandas() {
        String[] nombresColumnas = {"cod_comanda", "Mesa", "Plato", "Cantidad", "Categoria", "Fecha"};
        String[] registros = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select platoscomandas.cod_comanda, comandas.cod_mesa, platos.nombreplato, platoscomandas.cantidad, platos.categoriaplatos, comandas.fecha_comanda\n"
                    + "from comandas\n"
                    + "join platoscomandas on comandas.cod_comanda = platoscomandas.cod_comanda\n"
                    + "join platos on platoscomandas.cod_plato = platos.cod_plato;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_comanda");
                registros[1] = result.getString("cod_mesa");
                registros[2] = result.getString("nombreplato");
                registros[3] = result.getString("cantidad");
                registros[4] = result.getString("categoriaplatos");
                registros[5] = result.getString("fecha_comanda");

                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public DefaultTableModel mostrarComandasActualizar() {
        String[] nombresColumnas = {"cod_comanda", "cod_mesa", "cod_camarero", "fecha_comanda"};
        String[] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        try {
            Connection conexion = con.conectar();
            String sql = "select comandas.cod_comanda, comandas.cod_mesa, comandas.cod_camarero, comandas.fecha_comanda\n"
                    + "from comandas;";
            PreparedStatement st = conexion.prepareStatement(sql);
            ResultSet result = st.executeQuery();
            JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);

            while (result.next()) {
                registros[0] = result.getString("cod_comanda");
                registros[1] = result.getString("cod_mesa");
                registros[2] = result.getString("cod_camarero");
                registros[3] = result.getString("fecha_comanda");

                modelo.addRow(registros);

            }

            result.close();
            st.close();
            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de listado" + e, "Error", JOptionPane.ERROR_MESSAGE);

        }

        return modelo;
    }

    public void modificarComanda(String codigoComanda, String codigoMesa, String codigoCamarero, LocalDate fechaComanda) {
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            String sql = "update comandas set cod_mesa='" + codigoMesa + "', cod_camarero='" + codigoCamarero + "', fecha_comanda='" + fechaComanda + "' where cod_comanda='" + codigoComanda + "';";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "La comanda se actualizó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void comandaCocinaPdf(String codigoComanda) {

        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/comanda_cocina.pdf"));

            Image header = Image.getInstance("src/main/java/img/cabeceraCocina.png");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_LEFT);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 15, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Ticket comanda generado automaticamente para MI BAR ©\n\n\n");

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaPdf = new PdfPTable(5);

            tablaPdf.addCell("Comanda");
            tablaPdf.addCell("Mesa");
            tablaPdf.addCell("Plato");
            tablaPdf.addCell("Categoria");
            tablaPdf.addCell("Cantidad");

            try {
                Connection conexion = con.conectar();
                String sql = "SELECT \n"
                        + "    comandas.cod_comanda, \n"
                        + "    comandas.cod_mesa, \n"
                        + "    platos.nombreplato, \n"
                        + "    platos.categoriaplatos,\n"
                        + "    platoscomandas.cantidad\n"
                        + "FROM comandas\n"
                        + "JOIN platoscomandas ON comandas.cod_comanda = platoscomandas.cod_comanda\n"
                        + "JOIN platos ON platoscomandas.cod_plato = platos.cod_plato\n"
                        + "WHERE comandas.cod_comanda = '" + codigoComanda + "' AND platos.categoriaplatos = 'Entrante'or\n"
                        + "platos.categoriaplatos = 'Principal' or\n"
                        + "platos.categoriaplatos = 'Postre';;";
                PreparedStatement st = conexion.prepareStatement(sql);
                ResultSet result = st.executeQuery();
                JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);
                if (result.next()) {
                    do {
                        tablaPdf.addCell(result.getString(1));
                        tablaPdf.addCell(result.getString(2));
                        tablaPdf.addCell(result.getString(3));
                        tablaPdf.addCell(result.getString(4));
                        tablaPdf.addCell(result.getString(5));

                    } while (result.next());
                    documento.add(tablaPdf);
                }
                result.close();
                st.close();
                conexion.close();
            } catch (DocumentException | HeadlessException | SQLException e) {

            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado", "Reporte", JOptionPane.INFORMATION_MESSAGE);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en la imagen" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void comandaBarraPdf(String codigoComanda) {

        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/comanda_barra.pdf"));

            Image header = Image.getInstance("src/main/java/img/cabeceraBarra.png");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_LEFT);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 15, Font.BOLD, BaseColor.BLACK));
            parrafo.add("Ticket comanda generado automaticamente para MI BAR ©\n\n\n");

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tablaPdf = new PdfPTable(5);

            tablaPdf.addCell("Comanda");
            tablaPdf.addCell("Mesa");
            tablaPdf.addCell("Bebida");
            tablaPdf.addCell("Categoria");
            tablaPdf.addCell("Cantidad");

            try {
                Connection conexion = con.conectar();
                String sql = "SELECT \n"
                        + "    comandas.cod_comanda, \n"
                        + "    comandas.cod_mesa, \n"
                        + "    platos.nombreplato, \n"
                        + "    platos.categoriaplatos,\n"
                        + "    platoscomandas.cantidad\n"
                        + "FROM comandas\n"
                        + "JOIN platoscomandas ON comandas.cod_comanda = platoscomandas.cod_comanda\n"
                        + "JOIN platos ON platoscomandas.cod_plato = platos.cod_plato\n"
                        + "WHERE comandas.cod_comanda = 1 AND platos.categoriaplatos='Bebida';;";
                PreparedStatement st = conexion.prepareStatement(sql);
                ResultSet result = st.executeQuery();
                JOptionPane.showMessageDialog(null, "Conexion realizada", "Conexion", JOptionPane.INFORMATION_MESSAGE);
                if (result.next()) {
                    do {
                        tablaPdf.addCell(result.getString(1));
                        tablaPdf.addCell(result.getString(2));
                        tablaPdf.addCell(result.getString(3));
                        tablaPdf.addCell(result.getString(4));
                        tablaPdf.addCell(result.getString(5));

                    } while (result.next());
                    documento.add(tablaPdf);
                }
                result.close();
                st.close();
                conexion.close();
            } catch (DocumentException | HeadlessException | SQLException e) {

            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado", "Reporte", JOptionPane.INFORMATION_MESSAGE);

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en la imagen" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
