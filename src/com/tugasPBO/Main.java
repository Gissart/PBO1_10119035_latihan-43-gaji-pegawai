package com.tugasPBO;

public class Main {
    public static void main(String[] args){
        GajiPegawai pegawai = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        pegawai.setNama("Argya Aulia Fauzandika");
        pegawai.setAlamat("Talang Kelapa, Palembang");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        int total = pegawai.totalGaji(pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok());
        pegawai.setTotalGaji(total);
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(), pegawai.getUangTunjangan(), pegawai.getUangTransport(), pegawai.getGajiPokok(), pegawai.getTotalGaji());
    }
}
