package hust.soict.dsai.aims.screen;

import hust.soict.dsai.Aims.cart.Cart;
import hust.soict.dsai.Aims.media.DigitalVideoDisc;
import hust.soict.dsai.Aims.media.Media;
import hust.soict.dsai.Aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import hust.soict.dsai.aims.exception.PlayerException;

public class CartScreenController {

    private Cart cart;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TextField tfFilter;

    @FXML
    private Label totalCost;

    @FXML
    private Text play_content;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title")
        );
        colMediacategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category")
        );
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost")
        );
        tblMedia.setItems(this.cart.getItemsOrdered());
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        totalCost.setText(String.format("%.2f", cart.totalCost()) + " $");

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observableValue, Media oldValue, Media newValue) {
                        if(newValue!=null) updateButtonBar(newValue);
                    }
                }
        );}
    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if(media instanceof Playable) {
            btnPlay.setVisible(true);
        } else btnPlay.setVisible(false);
    }
    @FXML
    void btnRemovePressed(ActionEvent e) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        totalCost.setText(String.format("%.2f", cart.totalCost()) + " $");
    }



//    @FXML
//    void btnPlayPressed(ActionEvent e) {
//        Media media = tblMedia.getSelectionModel().getSelectedItem();
//        String playContent = ((DigitalVideoDisc)media).play();
//
//        play_content.setText(playContent);
//    }
}