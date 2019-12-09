package dkis.egov.software;

import java.util.List;

public class Model {

    /**
     * response : {"data":[{"id_aplikasi":1,"nama_aplikasi":"Contoh","deskripsi":"Ini hanya contoh","id_unit":2,"pengguna":"banyak","created_date":"","created_id":"","updated_date":"","updated_id":"","url":"apaaja@cirebonkota.go.id","api":"TIDAK ADA","terhubung_webservice":"TIDAK","url_webservice":"","aktif":"AKTIF","kode_aplikasi":"C1"}]}
     */





            private int id_aplikasi;
            private String nama_aplikasi;
            private String deskripsi;
            private int id_unit;
            private String pengguna;
            private String created_date;
            private String created_id;
            private String updated_date;
            private String updated_id;
            private String url;
            private String api;
            private String terhubung_webservice;
            private String url_webservice;
            private String aktif;
            private String kode_aplikasi;

    public Model(int id_aplikasi,
                 String nama_aplikasi, String deskripsi, int id_unit, String pengguna, String created_date, String created_id, String updated_date, String updated_id, String url, String api, String terhubung_webservice,
                 String url_webservice, String aktif, String kode_aplikasi) {
        this.id_aplikasi = id_aplikasi;
        this.nama_aplikasi = nama_aplikasi;
        this.deskripsi = deskripsi;
        this.id_unit = id_unit;
        this.pengguna = pengguna;
        this.created_date = created_date;
        this.created_id = created_id;
        this.updated_date = updated_date;
        this.updated_id = updated_id;
        this.url = url;
        this.api = api;
        this.terhubung_webservice = terhubung_webservice;
        this.url_webservice = url_webservice;
        this.aktif = aktif;
        this.kode_aplikasi = kode_aplikasi;
    }

    public int getId_aplikasi() {
                return id_aplikasi;
            }

            public void setId_aplikasi(int id_aplikasi) {
                this.id_aplikasi = id_aplikasi;
            }

            public String getNama_aplikasi() {
                return nama_aplikasi;
            }

            public void setNama_aplikasi(String nama_aplikasi) {
                this.nama_aplikasi = nama_aplikasi;
            }

            public String getDeskripsi() {
                return deskripsi;
            }

            public void setDeskripsi(String deskripsi) {
                this.deskripsi = deskripsi;
            }

            public int getId_unit() {
                return id_unit;
            }

            public void setId_unit(int id_unit) {
                this.id_unit = id_unit;
            }

            public String getPengguna() {
                return pengguna;
            }

            public void setPengguna(String pengguna) {
                this.pengguna = pengguna;
            }

            public String getCreated_date() {
                return created_date;
            }

            public void setCreated_date(String created_date) {
                this.created_date = created_date;
            }

            public String getCreated_id() {
                return created_id;
            }

            public void setCreated_id(String created_id) {
                this.created_id = created_id;
            }

            public String getUpdated_date() {
                return updated_date;
            }

            public void setUpdated_date(String updated_date) {
                this.updated_date = updated_date;
            }

            public String getUpdated_id() {
                return updated_id;
            }

            public void setUpdated_id(String updated_id) {
                this.updated_id = updated_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getApi() {
                return api;
            }

            public void setApi(String api) {
                this.api = api;
            }

            public String getTerhubung_webservice() {
                return terhubung_webservice;
            }

            public void setTerhubung_webservice(String terhubung_webservice) {
                this.terhubung_webservice = terhubung_webservice;
            }

            public String getUrl_webservice() {
                return url_webservice;
            }

            public void setUrl_webservice(String url_webservice) {
                this.url_webservice = url_webservice;
            }

            public String getAktif() {
                return aktif;
            }

            public void setAktif(String aktif) {
                this.aktif = aktif;
            }

            public String getKode_aplikasi() {
                return kode_aplikasi;
            }

            public void setKode_aplikasi(String kode_aplikasi) {
                this.kode_aplikasi = kode_aplikasi;
            }
        }